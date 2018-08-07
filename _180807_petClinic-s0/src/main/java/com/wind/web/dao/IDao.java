package com.wind.web.dao;
import java.util.ArrayList;

import com.wind.web.dto.ContentDto;
import com.wind.web.dto.SpecialtiesDto;
import com.wind.web.dto.VetsDto;
import com.wind.web.dto.VetspecialtiesDto;

public interface IDao {

	public ArrayList<VetsDto> vetslistDao();
	public ArrayList<SpecialtiesDto> vetselect_viewDao();
	public ArrayList<VetspecialtiesDto> vetselectDao(int specialty_id);
	public VetsDto vetselect2Dao(int id);
	
	
	
	
	public ArrayList<ContentDto> listDao();
	public void writeDao(String bName, String bTitle, String bContent);
	public ContentDto viewDao(String bId);
	public void deleteDao(String bId);
	public void modifyDao(String bName, String bTitle, String bContent, String bId);
	public void replyDao(     String bName, String bTitle, String bContent, int bGroup, int bStep, int bIndent);
	public ContentDto reply_viewDao(String bId);
	public void replyShape(String bGroup, String bStep);
	public void upHit(String bId);
}
