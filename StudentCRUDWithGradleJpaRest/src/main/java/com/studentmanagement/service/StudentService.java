package com.studentmanagement.service;

import java.util.List;

import com.studentmanagement.entity.Student;

public interface StudentService {

	public abstract void addStudent(Student student);

	public abstract void updateStudent(Student student);

	public abstract void removeStudent(int student);

	public abstract Student findStudentById(int sid);

	public abstract List<Student> listStudent();

}
