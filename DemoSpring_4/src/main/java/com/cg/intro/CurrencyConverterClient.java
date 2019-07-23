package com.cg.intro;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CurrencyConverterClient {

	public static void main(String args[]) throws Exception {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("currencyconverter.xml");
		
		CurrencyConverter crr = (CurrencyConverter) factory.getBean("currencyConverter");
		double rupees = crr.dollarsToRupees(50.0);
		System.out.println("50 $ is = "+rupees+ " Rs.");
		//Address add = context.getBean("address", Address.class);

		
	}
}
