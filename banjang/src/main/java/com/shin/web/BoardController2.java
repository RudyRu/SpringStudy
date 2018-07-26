package com.shin.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController2 {
	
//	@RequestMapping("/board/check_id")
//	public String ConfirmId(HttpServletRequest request, Model model) {
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");
//		model.addAttribute("id", id);
//		model.addAttribute("pw", pw);
//		
//		return "board/check_id";
//	}

	@RequestMapping("/board/check_id")
	public String ConfirmId(HttpServletRequest request, @RequestParam("id") String id, @RequestParam("pw") String pw, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "board/check_id";
	}

	@RequestMapping("/member/join")
	public String Join(
			HttpServletRequest request, 
			@RequestParam("id") String id, 
			@RequestParam("pw") String pw,
			@RequestParam("name") String name, 
			@RequestParam("email") String email,
			Model model) {

		Member member = new Member();
		member.setId(id);
		member.setPw(pw);
		member.setName(name);
		member.setEmail(email);
		
		model.addAttribute("member", member);
		
		return "member/join";
	}

	@RequestMapping("/member/joinsimple")
	public String JoinSimple(@ModelAttribute("mem") Member member) {

//		Member member = new Member();
//		member.setId(id);
//		member.setPw(pw);
//		member.setName(name);
//		member.setEmail(email);
//		
//		model.addAttribute("member", member);
		
		return "member/join";
	}

	@RequestMapping("/member/{memberId}")
	public String getMemberId(@PathVariable String memberId, Model model) {

		model.addAttribute("memberId", memberId);
		
		return "member/view";
	}
}
