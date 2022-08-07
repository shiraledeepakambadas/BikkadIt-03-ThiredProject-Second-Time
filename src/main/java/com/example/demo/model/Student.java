package com.example.demo.model;

import javax.persistence.Entity;

@Entity
public class Student {
	private int studentId;
	private String studentName;
	private String studentAge;
	private int studentage;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}
	public int getStudentage() {
		return studentage;
	}
	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentage=" + studentage + "]";
	}
	
	
	

}
