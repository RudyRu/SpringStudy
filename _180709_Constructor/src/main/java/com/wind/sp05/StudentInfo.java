package com.wind.sp05;

public class StudentInfo {
	
	private Student student;

	public StudentInfo(Student student) {
		super();
		this.student = student;
	}
	
	public void getStudentInfo() {
		if(student != null) {
			System.out.println("이름 : " + student.getName());
			System.out.println("나이 : " + student.getAge());
			System.out.println("학년 : " + student.getGradeNum());
			System.out.println("반 : " + student.getClassNum());
		}
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
}
