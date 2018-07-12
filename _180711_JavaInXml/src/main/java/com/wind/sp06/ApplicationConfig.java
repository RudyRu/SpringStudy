package com.wind.sp06;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public Student student1() {
		
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("비행");
		hobbies.add("달리기");
		
		Student student = new Student("슈퍼맨",20,hobbies);
		student.setHeight(180);
		student.setWeight(60);
		
		return student;
		
	}
}