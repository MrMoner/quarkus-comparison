package org.acme.spring.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("hello")
    public Greeting helloParam(
            @RequestParam("name") String name
    ) {
        return new Greeting("hello " + name);
    }

    @GetMapping("hello/{name}")
    public Greeting helloPath(
        @PathVariable("name") String name
    ) {
        return new Greeting("hello " + name);
    }
}
