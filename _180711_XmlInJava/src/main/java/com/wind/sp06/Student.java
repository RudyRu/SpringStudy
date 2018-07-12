package com.wind.sp06;

import java.util.ArrayList;

public class Student {
	private String name;
	private int age;
	private ArrayList<String> hobbies;
	private double height;
	private double weight;
	
	public Student(String name, int age, ArrayList<String> hobbies) {
		this.name = name;
		this.age = age;
		this.hobbies = hobbies;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public void sethobbies(ArrayList<String> hobbies) {
		this.hobbies = hobbies;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public ArrayList<String> gethobbies() {
		return hobbies;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
}
