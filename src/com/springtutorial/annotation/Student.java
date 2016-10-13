package com.springtutorial.annotation;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	@Required
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	@Required
	public void setName(String name) {
		this.name = name;
	}
	
	
}
