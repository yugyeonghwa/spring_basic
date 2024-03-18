package com.ict.ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain_DI {
	public static void main(String[] args) {
		ApplicationContext context = 
				new GenericXmlApplicationContext("com/ict/ex04/config.xml");
		
		MyProcess mp = (MyProcess)context.getBean("mp2");
		mp.prn();
    	
		
	}
}
