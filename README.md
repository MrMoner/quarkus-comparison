# Qarkus comparison

This project currently compares the performance of a simple hello-world REST appliaction using the following:
- Spring Web
- Spring WebFlux
- Quarkus with Spring Web
- Quarkus Mutiny

The performance tests use [K6](https://k6.io/) and the `load-test.js` script for performance test setup.

Performance results can be found in [performance-comparison.md](https://github.com/MrMoner/quarkus-comparison/blob/main/performance-comparison.md)