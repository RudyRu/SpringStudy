package com.wind.s07;

import javax.annotation.*;

public class OtherStudent {
	private String name;
	private int age;

	public OtherStudent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@SuppressWarnings("restriction")
	@PostConstruct
	public void initMethod() {
		System.out.println("InitMethod()");
	}
	
	@SuppressWarnings("restriction")
	@PreDestroy
	public void destroyMethod() {
		System.out.println("destroyMethod()");
	}
}