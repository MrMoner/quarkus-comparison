package com.example.reactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@SpringBootApplication
@RestController
public class ReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveApplication.class, args);
	}

	@GetMapping("/hello")
	public Mono<Greeting> helloParam(
		@RequestParam(value = "name", defaultValue = "World") String name
	) {
		return Mono.just(new Greeting("hello " + name));
	}

	@GetMapping("/hello/{name}")
	public Mono<Greeting> helloPath(
		@PathVariable(value = "name") String name
	) {
		return Mono.just(new Greeting("hello " + name));
	}

}
