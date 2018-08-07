package com.wind.web.dto;

public class SpecialtiesDto {
	
	private String id;
	private String name;
	public SpecialtiesDto(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public SpecialtiesDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
