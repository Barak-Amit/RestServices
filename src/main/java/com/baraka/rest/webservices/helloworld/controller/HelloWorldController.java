package com.baraka.rest.webservices.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.baraka.rest.webservices.helloworld.bean.HelloWorldBean;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping(path = "/helloworld")
	public HelloWorldBean helloName(final String name) {
		return new HelloWorldBean(name);
	}

	@GetMapping(path = "/helloworld/{name}/{topic}")
	public HelloWorldBean helloParameterName(@PathVariable final String name, @PathVariable final String topic) {
		return new HelloWorldBean(name, topic);
	}
}
