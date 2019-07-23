package com.cg.lab1.b;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Employee2.xml");
		
		Employee emp = context.getBean("emp",Employee.class);
		
		System.out.println("Employee Details: ");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println(emp);

	}

}
