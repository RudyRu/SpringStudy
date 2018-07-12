package com.wind.sp06;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {		
		
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(ApplicationConfig.class);
		BMICalculator bmiCalculator = ctx.getBean("bmiCalculator", BMICalculator.class);
		MyInfo user1 = ctx.getBean("user1", MyInfo.class);
		
		ctx.close();
	}
}
