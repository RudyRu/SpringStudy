package com.wind.sp03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		classpath = src/main/java + src/main/resource
		GenericXmlApplicationContext : xml 로부터 정보를 얻어옴
		AbstractApplicationContext : GenericXmlApplicationContext 의 부모클래스(추상)
		getBean(name, Class) : Class로부터 name 의 bean 생성
		*/
		
		//configlocation을 통해서 bean을 만들어달라고 주문 
		String configlocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configlocation);
		//myCalculator객체에 bean을 쓰기위해 저장
		MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class); 
		ctx.close();
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();
		

	}

}
