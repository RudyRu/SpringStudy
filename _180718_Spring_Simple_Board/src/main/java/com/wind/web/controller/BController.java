package com.wind.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wind.web.service.BContentService;
import com.wind.web.service.BListService;
import com.wind.web.service.BService;

@Controller
public class BController {
	
	BService service = null;
	
	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("/list");
		service = new BListService();
		service.excute(model);		
		return "list";
	}
	
	@RequestMapping("/content_view")
	public String contentView(
			HttpServletRequest httpServletRequest,
			Model model) {
		System.out.println("//content_view");
		model.addAttribute("request", httpServletRequest);
		service = new BContentService();
		service.excute(model);		
		return "content_view";
	}
	
}
