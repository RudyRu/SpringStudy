package com.shin.web.board.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.shin.web.board.dao.BoardDao;

public class BoardReplyService implements BoardService {

	@Override
	public void excute(Model model) {
		// TODO Auto-generated method stub
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String id = request.getParameter("id");
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String group = request.getParameter("group");
		String step = request.getParameter("step");
		String indent = request.getParameter("indent");
		
		BoardDao dao = new BoardDao();
		
		dao.reply(id, writer, title, content, group, step, indent);
	}

}
