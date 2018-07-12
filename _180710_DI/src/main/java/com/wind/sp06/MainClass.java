package com.wind.sp06;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String configLocation1 = "classpath:applicationCTX1.xml";
		String configLocation2 = "classpath:applicationCTX2.xml";
		
		AbstractApplicationContext ctx =
				new GenericXmlApplicationContext(configLocation1, configLocation2);
		
		Student student1 = ctx.getBean("student1", Student.class);
		System.out.println("The name of student1 is " + student1.getName());
		
		StudentInfo studentInfo = ctx.getBean("studentInfo1" , StudentInfo.class);
		Student student3 = studentInfo.getStudent();
		System.out.println("The name of student3 is " + student3.getName());
		
		if(student1.equals(student3)) {
			System.out.println("student1 == student3");
		}
		
		Student student2 = ctx.getBean("student2", Student.class);
		System.out.println(student2.getName());
		
		if(student2.equals(student1)) {
			System.out.println("student2 == student1");
		}else {
			
			System.out.println("student2 != student1");
		}		
		
	}

}
