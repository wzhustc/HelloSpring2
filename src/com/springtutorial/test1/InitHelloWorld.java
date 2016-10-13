package com.springtutorial.test1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloWorld implements BeanPostProcessor {
	
	//这是初始化init-method方法执行前执行的方法
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("BeforeInitialization : " + beanName);
		return bean;
	}
	
	//这是init-method方法执行后执行的方法
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		 
		System.out.println("AfterInitialization : " + beanName);
		return bean;
	}

	
	
}
