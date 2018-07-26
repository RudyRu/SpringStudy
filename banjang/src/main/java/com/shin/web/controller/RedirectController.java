package com.shin.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
	
	@RequestMapping("/student/confirm")
	public String studentRedirect(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		model.addAttribute("id", id);
		
		if(id.equals("abc")) {
			return "redirect:/student/ok";
		}
		return "redirect:/student/ng";
	}

	@RequestMapping("/student/ok")
	public String studentOk(HttpServletRequest request, Model model) {
		return "student/ok";
	}

	@RequestMapping("/student/ng")
	public String studentNg(HttpServletRequest request, Model model) {
		return "student/ng";
	}
}
