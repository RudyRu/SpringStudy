package com.wind.web.service;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.wind.web.dao.BDao;
import com.wind.web.dto.BDto;

public class BListService implements BService {

	@Override
	public void excute(Model model) {		
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		model.addAttribute("list", dtos);
	}

}
