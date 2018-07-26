package com.shin.web.board.service;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.shin.web.board.dao.BoardDao;
import com.shin.web.board.dto.BoardDto;

public class BoardListService implements BoardService {

	@Override
	public void excute(Model model) {
		// TODO Auto-generated method stub
		BoardDao dao = new BoardDao();
		ArrayList<BoardDto> list = dao.list();
		model.addAttribute("list", list);
	}


}
