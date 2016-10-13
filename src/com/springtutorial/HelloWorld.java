package com.springtutorial;

public class HelloWorld {
	private String message;
	
	public void getMessage() {
		System.out.println("your message:" + message);
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init() {
		System.out.println("this is init method invoked");
	}
	
	public void destroy() {
		System.out.println("this is destroy method invoked");
	}
}