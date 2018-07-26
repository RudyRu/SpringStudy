package com.shin.web;

//import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {
	
	@RequestMapping("/student/form")
	public String studentForm() {
		return "student/form";
	}
//
//	@RequestMapping(value = "/student/create", method = RequestMethod.POST)
//	public String studentCreate(@Valid Student student, BindingResult result) {
//		String go = "student/ok";
//
////		StudentValidator validator = new StudentValidator();
////		validator.validate(student, result);
//
//		if(result.hasErrors()) {
//			go = "student/form";
//		}
//		return go;
//	}
//	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new StudentValidator());
	}

}
