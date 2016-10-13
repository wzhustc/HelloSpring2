package com.springtutorial.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		// 获得应用的上下文，处理创建并初始化所有的对象
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		// 使用已创建的上下文的 getBean() 方法来获得所需的 bean，
		// 这个方法使用 bean 的 ID 返回一个最终可以转换为实际对象的通用对象
		// 这里的getBean的参数对应的是Beans.xml中的id=""，如果不一致，报错。
		// 输出的值是id=""对应的value值。

//		AbstractApplicationContext apContext = new ClassPathXmlApplicationContext("Beans.xml");
//		HelloWorld objA = (HelloWorld) apContext.getBean("helloworld");
//		objA.setMessage1("Hello, I am objA");
//		objA.getMessage1();
//		apContext.registerShutdownHook();
		
		HelloWorld objA = (HelloWorld) context.getBean("helloworld");
		objA.getMessage1();
		objA.getMessage2();
		
		HelloChina objB = (HelloChina) context.getBean("helloChina");
		objB.getMessage1();
		objB.getMessage2();
		objB.getMessage3();
		
	}

}
