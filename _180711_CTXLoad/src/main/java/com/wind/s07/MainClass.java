package com.wind.s07;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:applicationCTX.xml");
		ctx.refresh();
		
		Student student = ctx.getBean("student", Student.class );
		OtherStudent otherStudent = ctx.getBean("otherStudent", OtherStudent.class);
		System.out.println("이름:" + student.getName());
		System.out.println("나이:" + student.getAge());
		System.out.println("이름:" + otherStudent.getName());
		System.out.println("나이:" + otherStudent.getAge());
		
		ctx.close();
	}

}
