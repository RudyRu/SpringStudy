package com.shin.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
//	@RequestMapping(value = "/board/view", method = RequestMethod.GET)
//	public String view(Locale locale, Model model) {
//		model.addAttribute("id", 20);
//		System.out.println(model);
//		return "board/view";
//	}
//	
//	@RequestMapping(value = "/board/content", method = RequestMethod.GET)
//	public ModelAndView content(Locale locale, Model model) {
//		
//		model.addAttribute("page", "content");
//		System.out.println(model);
//		
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("id", 15);
//		mv.addObject("name", "ssss");
//		mv.setViewName("board/content");
//		return mv;
//	}
//	
//	@RequestMapping(value = "/board/reply", method = RequestMethod.GET)
//	public ModelAndView reply(Locale locale, Model model) {
//		
//		model.addAttribute("page", "reply");
//		System.out.println(model);
//		
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("id", 15);
//		mv.addObject("name", "ssss");
//		mv.setViewName("board/reply");
//		return mv;
//	}
	
}
