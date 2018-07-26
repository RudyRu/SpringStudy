package com.shin.web;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator {

	@Override
	public boolean supports(Class<?> cls) {
		// TODO Auto-generated method stub
		return Student.class.isAssignableFrom(cls);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		Student student = (Student) target;
		String studentName = student.getName();
		if(studentName == null || studentName.trim().isEmpty()) {
			System.out.println("student name error");
			errors.rejectValue("name", "trouble");
		}
		
		int age = student.getAge();
		if(age < 1) {
			System.out.println("age error");
			errors.rejectValue("age", "trouble");
		}

	}

}
