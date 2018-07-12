package com.wind.sp06;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainClass {

	public static void main(String[] args) {
		//config자바파일을 불러올땐 여기부분이 달라진다.
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Student student1 = ctx.getBean("student1", Student.class);
		System.out.println("이름은 "+student1.getName());
		
		Student student2 = ctx.getBean("student2", Student.class);
		System.out.println("이름은 "+student2.getName());

	}

}