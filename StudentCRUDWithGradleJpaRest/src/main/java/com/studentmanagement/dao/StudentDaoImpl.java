package com.studentmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.studentmanagement.entity.Student;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {

	@PersistenceContext
	private EntityManager entityManager;

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public Student getStudentById(int sid) {
		Student std = entityManager.find(Student.class, sid);
		return std;
	}
	@Override

	public void addStudent(Student std) {
		entityManager.persist(std);
	}

	@Override

	public void removeStudent(int std) {
		Student std1=getStudentById(std);
		entityManager.remove(std1);
	}

	@Override

	public void updateStudent(Student std) {
		entityManager.merge(std);
	}


	@Override
	public List<Student> listStudent() {
		// TODO Auto-generated method stub

		TypedQuery<Student> q2 = entityManager.createQuery("select c from Student c", Student.class);
		List<Student> l1 = q2.getResultList();
		return l1;
	}

}
