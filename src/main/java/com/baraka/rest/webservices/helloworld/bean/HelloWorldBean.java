package com.baraka.rest.webservices.helloworld.bean;

public class HelloWorldBean {

	private String name;

	public HelloWorldBean(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hello " + name;
	}

}
