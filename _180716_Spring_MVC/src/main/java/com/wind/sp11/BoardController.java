package com.wind.sp11;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {
	
//	@RequestMapping("/board/check_id")
//	public String confirmId(
//		HttpServletRequest httpServletRequest, Model model){
//		
//			String id = httpServletRequest.getParameter("id");
//			String pw = httpServletRequest.getParameter("pw");
//			model.addAttribute("id", id);
//			model.addAttribute("pw", pw);
//			
//		return "board/check_id";
//	}
	
	@RequestMapping("/board/check_id")
	public String confirmId(
			@RequestParam("id") String id, 
			@RequestParam("pw") String pw,
			Model model) {
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "board/check_id";
	}
}
