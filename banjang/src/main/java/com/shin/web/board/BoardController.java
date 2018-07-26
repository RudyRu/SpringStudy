package com.shin.web.board;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shin.web.board.service.BoardContentService;
import com.shin.web.board.service.BoardDeleteService;
import com.shin.web.board.service.BoardListService;
import com.shin.web.board.service.BoardModifyService;
import com.shin.web.board.service.BoardReplyService;
import com.shin.web.board.service.BoardReplyViewService;
import com.shin.web.board.service.BoardService;
import com.shin.web.board.service.BoardWriteService;
import com.shin.web.util.Constant;

@Controller
public class BoardController {
	BoardService service = null;
	private JdbcTemplate template;
	
	
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}

	@RequestMapping("/board/list")
	public String list(Model model) {
		System.out.println("/board/list");
		service = new BoardListService();
		service.excute(model);
		return "board/list";
	}
	
	@RequestMapping("/board/view")
	public String view(HttpServletRequest request, Model model) {
		System.out.println("/board/view");
		model.addAttribute("request", request);
		BoardContentService service = new BoardContentService();
		service.excute(model);
		model.addAttribute("target", "modify");
		return "board/view";
	}

	@RequestMapping(value="/board/write", method=RequestMethod.GET)
	public String write_view(Model model) {
		System.out.println("/board/writ get form");
		model.addAttribute("target", "write");
		return "board/view";
	}

	@RequestMapping(value="/board/write", method=RequestMethod.POST)
	public String write(HttpServletRequest request, Model model) {
		System.out.println("/board/write post form");
		model.addAttribute("request", request);
		BoardWriteService service = new BoardWriteService();
		service.excute(model);
		return "redirect:list";
	}

	@RequestMapping("/board/delete")
	public String delete(HttpServletRequest request, Model model) {
		System.out.println("/board/delete");
		model.addAttribute("request", request);
		BoardDeleteService service = new BoardDeleteService();
		service.excute(model);
		return "redirect:board/list";
	}

	@RequestMapping(value="/board/modify", method=RequestMethod.POST)
	public String modify(HttpServletRequest request, Model model) {
		System.out.println("/board/modify");
		model.addAttribute("request", request);
		BoardModifyService service = new BoardModifyService();
		service.excute(model);
		return "redirect:list";
	}

	@RequestMapping(value="/board/reply", method=RequestMethod.POST)
	public String reply(HttpServletRequest request, Model model) {
		System.out.println("/board/reply");
		model.addAttribute("request", request);
		BoardReplyService service = new BoardReplyService();
		service.excute(model);
		return "redirect:list";
	}

	@RequestMapping("/board/reply_view")
	public String reply_view(HttpServletRequest request, Model model){
		System.out.println("reply_view()");
		model.addAttribute("request", request);
		BoardReplyViewService service = new BoardReplyViewService();
		service.excute(model);
		return "board/reply_view";
	}

}
