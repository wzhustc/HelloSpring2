package com.springtutorial.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("Beans2.xml");
		
		Student st = (Student)con.getBean("student");
		System.out.println(st.getAge());
		System.out.println(st.getName());
	}
}
