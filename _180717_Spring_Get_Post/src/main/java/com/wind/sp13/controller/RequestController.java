package com.wind.sp13.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RequestController {
	
	@RequestMapping("/Index")
	public String goIndex() {
		return "index";
	}
	
//	@RequestMapping(value="/student", method=RequestMethod.POST)
//	@RequestMapping(value="/student", method=RequestMethod.GET)
	@RequestMapping(value="/student")
//	@RequestMapping(value="/student", method= {RequestMethod.GET, RequestMethod.POST})
	public String goStudent(
			HttpServletRequest httpServletRequest, 
			Model model) {
		
		String id = httpServletRequest.getParameter("id");
		String pw = httpServletRequest.getParameter("pw");
		
		model.addAttribute("studentId", id);
		model.addAttribute("studentPw", pw);
		
		return "student";
	}
	
	
}
