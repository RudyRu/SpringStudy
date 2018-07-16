package com.wind.sp11;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/content")
public class AnoController {
	
	@RequestMapping("/contentView")
	public String contentView(Model model) {
		model.addAttribute("id", "GANA");		
		return "content/contentView";
	}
}
