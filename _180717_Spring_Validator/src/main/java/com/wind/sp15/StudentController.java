package com.wind.sp15;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
	@RequestMapping("/student_form")
	public String studentForm() {
		return "create_page";
	}
	
	@RequestMapping("/create")
	public String studentCreate(
			Student student,
			BindingResult result) {
		String page = "create_done_page";	
		
		StudentValidator validator = new StudentValidator();
		validator.validate(student, result);
		if(result.hasErrors()) {
			page = "create_page";
		}
		return page;
	}
}
