package com.springtutorial.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		TestEditor te = (TestEditor) context.getBean("spellCheck");
		
	}
	
	
}
