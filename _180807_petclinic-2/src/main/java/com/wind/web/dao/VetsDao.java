package com.wind.web.dao;
import java.util.ArrayList;

import com.wind.web.dto.ContentDto;
import com.wind.web.dto.SpecialtiesDto;
import com.wind.web.dto.VetsDto;
import com.wind.web.dto.VetspecialtiesDto;

public interface VetsDao {
	public ArrayList<VetspecialtiesDto> vetselectDao(int specialty_id);
	public ArrayList<VetsDto> vetslistDao();
	public VetsDto vetselect2Dao(int id);
	public ArrayList<VetsDto> vetselect3Dao(int id);
	
	public void vet_addDao(String first_name, String last_name);
}
