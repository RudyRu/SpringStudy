package com.shin.web.board.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.shin.web.board.dao.BoardDao;

public class BoardDeleteService implements BoardService {

	@Override
	public void excute(Model model) {
		// TODO Auto-generated method stub
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		String id = request.getParameter("id");
		BoardDao dao = new BoardDao();
		dao.delete(id);
	}

}
