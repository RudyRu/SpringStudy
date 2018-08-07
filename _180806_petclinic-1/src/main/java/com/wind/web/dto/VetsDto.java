package com.wind.web.dto;

public class VetsDto {
	
	String id;
	String first_name;
	String last_name;
	
	public VetsDto() { }

	public VetsDto(String id, String first_name, String last_name) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
	}

	public String getId() {
		return id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	
	
	

}
