package com.springtutorial.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans5.xml");
		
		StudentDAOImpl studentDAOImpl = (StudentDAOImpl) context.getBean("studentDAOImpl");
		
		studentDAOImpl.create("Stark", 22);
		studentDAOImpl.create("Jhon Snow", 23);
		studentDAOImpl.create("AYa", 15);
		
		System.out.println("---------------------");
		List<Student> list = studentDAOImpl.listStudents();
		for (Student student : list) {
			System.out.print("id : " + student.getId());
			System.out.print(", name : " + student.getName());
			System.out.print( ", age : " + student.getAge());
		}
		
		System.out.println("---------------------");
		Student student = studentDAOImpl.selectStudentById(3);
		System.out.println("id=3的name ： " + student.getName());
		
		System.out.println("---------------------");
		Student st = studentDAOImpl.selectStudentByName("AYa");
		System.out.println("name=AYa的年龄：" + st.getAge());
		
		System.out.println("---------------------");
		studentDAOImpl.update(1, 55);
		Student s = studentDAOImpl.selectStudentById(1);
		System.out.println("id=1的年龄为：" + s.getAge());
		
	}

}
