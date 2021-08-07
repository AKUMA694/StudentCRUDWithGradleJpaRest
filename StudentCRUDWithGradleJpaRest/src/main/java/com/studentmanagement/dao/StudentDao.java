package com.studentmanagement.dao;

import java.util.List;

import com.studentmanagement.entity.Student;

public interface StudentDao {

	public abstract Student getStudentById(int sid);

	public abstract void addStudent(Student std);

	public abstract void removeStudent(int std);

	public abstract void updateStudent(Student std);

	public abstract List<Student> listStudent();

}
