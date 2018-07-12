package com.wind.sp06;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Student student1 = ctx.getBean("student1", Student.class);
		Student student2 = ctx.getBean("student2", Student.class);
		
		System.out.println("student1 of name : " + student1.getName());	
		System.out.println("student1 of age : " + student1.getAge());
		
		System.out.println("student2 of name : " + student2.getName());	
		System.out.println("student2 of age : " + student2.getAge());
		
		ctx.close();
		
	}

}
