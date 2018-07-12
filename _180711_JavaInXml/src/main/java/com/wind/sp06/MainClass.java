package com.wind.sp06;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {		
		
		//자바를 포함한 XML 을 이용한 방법
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:ApplicationCTX.xml");
		
		Student student1 = ctx.getBean("student1", Student.class);
		System.out.println("이름은 "+student1.getName());
		
		Student student2 = ctx.getBean("student2", Student.class);
		System.out.println("이름은 "+student2.getName());

	}

}
