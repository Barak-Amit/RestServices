package com.baraka.rest.webservices.helloworld.bean;

public class HelloWorldBean {

	private String name;
	private String topic;

	public HelloWorldBean(String name) {
		this.name = name;
	}

	public HelloWorldBean(String name, String topic) {
		this.name = name;
		this.topic = topic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "Hello " + name;
	}

}
