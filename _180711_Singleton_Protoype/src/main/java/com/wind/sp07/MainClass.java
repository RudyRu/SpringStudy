package com.wind.sp07;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx =
				new GenericXmlApplicationContext(configLocation);
	
		Student student1 = ctx.getBean("student", Student.class);
		System.out.println("이름 : " + student1.getName());
		System.out.println("나이 : " + student1.getAge());
		
		Student student2 = ctx.getBean("student", Student.class);
		student2.setName("햅번");
		System.out.println("이름 : " + student1.getName());
		System.out.println("나이 : " + student1.getAge());
		
		if(student1.equals(student2)) {
			System.out.println("student1 == student2");
		}
		
		Student act1 = ctx.getBean("act", Student.class);	
		System.out.println("이름 : " + act1.getName());
		
		
		Student act2 = ctx.getBean("act", Student.class);
		act2.setName("안젤리나");
		System.out.println("이름 : " + act1.getName());
		System.out.println("이름 : " + act2.getName());
		
		if(act1.equals(act2)) {
			System.out.println("act1 == act2");
		}else {
			System.out.println("act1 != act2");
		}
		
		
	}

}
