package com.wind.sp06;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public BMICalculator bmiCalculator() {
		
		BMICalculator bmiCalculator = new BMICalculator();
		
		bmiCalculator.setLow_weight(18.5);
		bmiCalculator.setNormal(25);
		bmiCalculator.setOver_weight(27);
		bmiCalculator.setObesity(30);
		bmiCalculator.bmi_calculator(75, 180);
		
		return bmiCalculator;		
	}
	
	@Bean
	public MyInfo user1() {
		
		BMICalculator bmiCalculator = new BMICalculator();
		bmiCalculator.bmi_calculator(75, 180);
		
		MyInfo user1 = new MyInfo();
		user1.setName("그레고리팩");		
		
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("수영");
		hobbies.add("보드");
		user1.setHobbies(hobbies);		
		user1.getHobbies();
		
		user1.setHeight(180);
		user1.setWeight(75);
		user1.setBmiCalculator(bmiCalculator);
		user1.getInfo();
		
		return user1;
		
	}
}
