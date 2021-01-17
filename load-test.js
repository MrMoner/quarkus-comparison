import http from 'k6/http';
import { check } from 'k6';

export let options = {
  stages: [
    { duration: '45s', target: 30 },
    { duration: '1m30s', target: 20 },
    { duration: '25s', target: 0 },
  ],
};

export default function () {
  let res = http.get('http://localhost:8080/hello/john');
  check(res, { 'status was 200': (r) => r.status == 200 });
}