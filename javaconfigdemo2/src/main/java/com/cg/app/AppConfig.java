package com.cg.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cg.demo.EmployeeDAO;
import com.cg.demo.EmployeeService;

@Configuration //This is replacement of SPRING.xml
@ComponentScan("com.cg.demo")
public class AppConfig {
	
	
}
