package com.example.demo.serviceI;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {
	public int addStudent(Student student);
	public List<Student> addAllStudent();
	public Student getStudentById();

}
