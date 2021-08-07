package com.studentmanagement.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanagement.dao.StudentDao;
import com.studentmanagement.entity.Student;



@Service("studentService")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao dao;
	@Override
	public void addStudent(Student std) {
		dao.addStudent(std);//persist()
	}
	@Override
	public void updateStudent(Student std) {
		dao.updateStudent(std);
	}
	@Override
	public void removeStudent(int std) {
		dao.removeStudent(std);
	}
	@Override
	public Student findStudentById(int sid) {
		// no need of transaction, as it's an read operation
		Student std = dao.getStudentById(sid);
		return std;
	}
	@Override
	public List<Student> listStudent() {
		// TODO Auto-generated method stub
		List<Student> l1 = dao.listStudent();
		return l1;
	}
}