package com.cg.lab1.c;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Employee3.xml");
		SBU sbu = context.getBean(SBU.class);
		System.out.println("SBU details");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("SbuCode: "+sbu.getSbuCode()+" SbuHead: "+sbu.getSbuHead()+" SbuName: "+sbu.getSbuName());
		System.out.println("");
		System.out.println("Employee Details:");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println(sbu.getEmpList());
		//System.out.println(sbu);
	}

}
