package com.wind.web.dao;
import java.util.ArrayList;

import com.wind.web.dto.ContentDto;
import com.wind.web.dto.SpecialtiesDto;
import com.wind.web.dto.VetsDto;
import com.wind.web.dto.VetspecialtiesDto;

public interface SpecialtiesDao {
	public ArrayList<SpecialtiesDto> vetselect_viewDao();
}
