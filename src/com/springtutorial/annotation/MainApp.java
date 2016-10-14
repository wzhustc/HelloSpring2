package com.springtutorial.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("Beans3.xml");
		
		
		Student st = (Student)con.getBean("student1");
		System.out.println(st.getAge());
		System.out.println(st.getName());
		
		System.out.println("------------------");
		TextEditor te = (TextEditor) con.getBean("textEditor");
		te.spellCheck();
		
		System.out.println("------------------");
		Profile profile = (Profile) con.getBean("profile");
		profile.printAge();
		profile.printName();
	}
}
