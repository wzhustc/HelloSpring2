package com.springtutorial.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		//这里getBean()的参数是Bean.xml中的id，
//		TestEditor te = (TestEditor) context.getBean("testEditor");
//		//这里用构造函数来注入bean
//		te.spellCheck();
		
		//这里用setter方法注入bean
		TestEditor2 te2 = (TestEditor2) context.getBean("testEditor2");
		te2.spellCheck();
	}
	
	
}
