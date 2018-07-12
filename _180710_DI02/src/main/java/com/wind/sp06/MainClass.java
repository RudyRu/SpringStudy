package com.wind.sp06;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext(configLocation);
		Family family = ctx.getBean("family", Family.class);
		ctx.close();
		
		System.out.println(family.fatherName);
		System.out.println(family.motherName);
		System.out.println(family.brotherName);
	}

}
