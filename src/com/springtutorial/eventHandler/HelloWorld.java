package com.springtutorial.eventHandler;

public class HelloWorld {
	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		System.out.println("your message : " + message);
		return message;
	}
}
