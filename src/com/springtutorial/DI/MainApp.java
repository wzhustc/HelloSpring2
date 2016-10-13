package com.springtutorial.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		//这里getBean()的参数是Bean.xml中的id，
		TestEditor te = (TestEditor) context.getBean("testEditor");
		
		te.spellCheck();
		
	}
	
	
}
