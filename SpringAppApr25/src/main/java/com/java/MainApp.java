package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// to load the spring.xml file
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		//to get the object
		Product pob=(Product) context.getBean("productob");
		// to display
		pob.display();
	}

}
