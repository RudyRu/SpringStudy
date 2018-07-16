package com.wind.sp11;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/next")
public class NextController {
	
	@RequestMapping("/pageone")
	public String next1(Model model) {
		model.addAttribute("id", 911);
		return "next/pageone";
	}
}
