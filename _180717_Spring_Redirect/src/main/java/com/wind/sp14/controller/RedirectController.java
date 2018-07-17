package com.wind.sp14.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RedirectController {

//	@RequestMapping("/student_confirm")
//	public String studentRedirect(
//			HttpServletRequest httpServletRequest,
//			Model model){
//		
//		String id = httpServletRequest.getParameter("id");
//		model.addAttribute("id", id);
//		
//		if(id.equals("abc")) {
//			
//			return "redirect:student_ok";
//		}
//		return "redirect:student_ng";
//	}
	
	
	@RequestMapping("/student_confirm")
	public String studentRedirect(
			RedirectAttributes redirectAttributes, Student student){
		
		RedirectAttributes rd = redirectAttributes.addFlashAttribute("id", student);		
		
		if(student.getId().equals("abc")) {
			return "redirect:student_ok?id=abc";
		}
		return "redirect:student_ng";
	}
	
	@RequestMapping("/student_ok")
	public String studentOk(RedirectAttributes redirectAttributes, Student student){		
		redirectAttributes.getFlashAttributes();
		return "student_ok";
	}
	
	@RequestMapping("/student_ng")
	public String studentNg(RedirectAttributes redirectAttributes, Model model) {
		redirectAttributes.getFlashAttributes();
		return "student_ng";
	}
	
}
