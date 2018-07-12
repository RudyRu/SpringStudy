package com.wind.sp06;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		Student student1 = ctx.getBean("student1", Student.class);
		System.out.println("이름 : " + student1.getName());
		System.out.println("나이 : " + student1.getAge());
		
		Student student2 = ctx.getBean("student2", Student.class);
		System.out.println("이름 : " + student2.getName());
		System.out.println("나이 : " + student2.getAge());
		
		Conan conan = ctx.getBean("conan", Conan.class);
		conan.setName("수지");
		conan.setAge(26);
		
		System.out.println("이름: " + conan.getName());
		System.out.println("나이: " + conan.getAge());
		
		ctx.close();
	}

}
