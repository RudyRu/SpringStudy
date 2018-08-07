package com.wind.web;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wind.web.dao.SpecialtiesDao;
import com.wind.web.dao.VetsDao;
import com.wind.web.dto.VetsDto;
import com.wind.web.dto.VetspecialtiesDto;

@Controller
public class VetsController {

	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("/vetslist")
	public String vetslist(Model model) {
		VetsDao dao = sqlSession.getMapper(VetsDao.class);
		model.addAttribute("vetslist", dao.vetslistDao());
		return "vetslist";
	}
	
	@RequestMapping("/vetselect_view")
	public String vetselect_view(HttpServletRequest request, Model model) { 
		SpecialtiesDao dao = sqlSession.getMapper(SpecialtiesDao.class);
		model.addAttribute("vetselect_view", dao.vetselect_viewDao());
		return "vetselect_view"; 
	}
	
	@RequestMapping("/vetselect")
	public String vetselect(HttpServletRequest request, Model model) {
		VetsDao dao = sqlSession.getMapper(VetsDao.class);
//		model.addAttribute("vetselect", dao.vetselectDao(Integer.parseInt(request.getParameter("specialty_id"))));
		
		ArrayList<VetspecialtiesDto> dto;
		dto = dao.vetselectDao(Integer.parseInt(request.getParameter("specialty_id")));

		ArrayList<VetsDto> dto2 = new ArrayList<VetsDto>();
		for(int i=0;i<dto.size();i++) {
			dto2.add(dao.vetselect2Dao(dto.get(i).getVet_id()));
			System.out.println(dto.get(i).getVet_id());
			System.out.println("vets_id = "+dao.vetselect2Dao(dto.get(i).getVet_id()));
		}
		model.addAttribute("vetselect2", dto2);
		
		System.out.println("size = " + dto.get(0).getVet_id());		
		System.out.println("size = " + dto.get(1).getVet_id());		
		System.out.println(dto.getClass());
		System.out.println(dto.size());
		return "vetselect";
	}
	
	@RequestMapping("/vetselect3")
	public String vetselect3(HttpServletRequest request, Model model) {
		VetsDao dao = sqlSession.getMapper(VetsDao.class);
		model.addAttribute("vetselect3", dao.vetselect3Dao(Integer.parseInt(request.getParameter("specialty_id"))));
		return "vetselect3";
	}
	
	@ExceptionHandler
	public String handlerException(Exception e) {
		return "viewerror";		
	}
	
	@RequestMapping("/vet_add_view")
	public String vet_add_view() {
		return "vet_add_view";		
	}
	
	@RequestMapping("/vet_add")
	public String vet_add(HttpServletRequest request) {
		VetsDao dao = sqlSession.getMapper(VetsDao.class);
		dao.vet_addDao(request.getParameter("first_name"), 
				request.getParameter("last_name"));
		return "redirect:vetslist";		
	}
	
	
}
