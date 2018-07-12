package com.wind.sp04;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		String configlocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configlocation);
		MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);
		ctx.close();
		
		myInfo.getInfo();
	}

}
