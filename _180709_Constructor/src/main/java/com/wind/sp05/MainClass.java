package com.wind.sp05;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String configlocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx= new GenericXmlApplicationContext(configlocation);
		StudentInfo studentInfo = ctx.getBean("studentInfo", StudentInfo.class);
		ctx.close();
		
		studentInfo.getStudentInfo();

	}

}
