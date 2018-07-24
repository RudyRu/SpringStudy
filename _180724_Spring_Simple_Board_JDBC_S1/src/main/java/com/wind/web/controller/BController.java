package com.wind.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wind.web.service.BContentService;
import com.wind.web.service.BDeleteService;
import com.wind.web.service.BListService;
import com.wind.web.service.BModifyService;
import com.wind.web.service.BReplyService;
import com.wind.web.service.BReplyViewService;
import com.wind.web.service.BService;
import com.wind.web.service.BWriteService;
import com.wind.web.util.Constant;

@Controller
public class BController {
	
	BService service = null;
	private JdbcTemplate template;

	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}

	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("/list");
		service = new BListService();
		service.execute(model);		
		return "list";
	}
	
	@RequestMapping("/content_view")
	public String content_view(
			HttpServletRequest httpServletRequest,
			Model model) {
		System.out.println("/content_view");
		model.addAttribute("request", httpServletRequest);
		service = new BContentService();
		service.execute(model);		
		return "content_view";
	}
	
	@RequestMapping("/write_view")
	public String write_view(Model model) {
		System.out.println("/write_view");
		return "write_view";
	}
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model) {
		System.out.println("/write");
		model.addAttribute("request", request);
		service = new BWriteService();
		service.execute(model);
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {
		System.out.println("/delete");
		model.addAttribute("request", request);
		service = new BDeleteService();
		service.execute(model);
		return "redirect:list";
	}
	
	
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modify(HttpServletRequest request, Model model) {
		System.out.println("/modify");
		model.addAttribute("request", request);
		service = new BModifyService();
		service.execute(model);
		return "redirect:list";
	}
	
	
	@RequestMapping("/reply")
	public String reply(
			HttpServletRequest request,
			Model model) {
		System.out.println("/reply");
		model.addAttribute("request", request);
		service = new BReplyService();
		service.execute(model);
		return "redirect:list";
	}
	
	@RequestMapping("/reply_view")
	public String reply_view(
			HttpServletRequest request,
			Model model) {
		System.out.println("/reply_view");
		model.addAttribute("request", request);
		service = new BReplyViewService();
		service.execute(model);
		return "reply_view";
	}
	
}
