package com.wind.sp06;

public class Family {
	
	String fatherName;
	String motherName;
	String brotherName;
	
	public Family(String fatherName, String motherName) {
		super();
		this.fatherName = fatherName;
		this.motherName = motherName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getBrotherName() {
		return brotherName;
	}

	public void setBrotherName(String brotherName) {
		this.brotherName = brotherName;
	}
	
	
}
