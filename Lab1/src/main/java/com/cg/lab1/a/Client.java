package com.cg.lab1.a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Employee1.xml");
		Employee emp = context.getBean(Employee.class);
		System.out.println("Employee Details...");
		System.out.println("----------------------------");
		System.out.println("Employee ID "+emp.getEmployeeId());
		System.out.println("Employee Name "+emp.getEmployeeName());
		System.out.println("Employee Salary "+emp.getSalary());
		System.out.println("Employee Business Unit "+emp.getBusinessUnit());
		System.out.println("Employee Age "+emp.getAge());
		
	}

}
