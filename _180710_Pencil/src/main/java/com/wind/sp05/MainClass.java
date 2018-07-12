package com.wind.sp05;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		Pencil pencil = ctx.getBean("pencil", Pencil.class);
		pencil.use();
		
		ctx.close();
	}

}
