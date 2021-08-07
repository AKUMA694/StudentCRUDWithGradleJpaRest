package com.studentmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentmanagement.entity.Student;
import com.studentmanagement.service.StudentService;

@RestController
@RequestMapping("/studentManagement")
public class StudentController {
	@Autowired
	StudentService serviceobj;

	// Create Student		//http://localhost:8586/studentManagement/StudentCreation
	@PostMapping("/StudentCreation") //
	public ResponseEntity<String> StudentCreation(@RequestBody Student std) {
		serviceobj.addStudent(std);
		return new ResponseEntity<String>("Student Added successfully", new HttpHeaders(), HttpStatus.OK);
	}

	// Get Particular Student Data
	@GetMapping("/GetStudent/{id}") //http://localhost:8586/studentManagement/getStudent/121
	private ResponseEntity<Student> getEmployee(@PathVariable("id") int id) {
		Student e = serviceobj.findStudentById(id);
		return new ResponseEntity<Student>(e, new HttpHeaders(), HttpStatus.OK);

	}

	// Get All Students Data
	@GetMapping("/GetAllStudents") // http://localhost:8586/studentManagement/GetAllStudents
	private ResponseEntity<List<Student>> getAllStudent() {
		List<Student> stdlist = serviceobj.listStudent();
		return new ResponseEntity<List<Student>>(stdlist, new HttpHeaders(), HttpStatus.OK);

	}

	// Updating Students data
	@PutMapping("/UpdateStudent")

	public ResponseEntity<String> UpdateStudent(@RequestBody Student std) {
		serviceobj.updateStudent(std);
		return new ResponseEntity<String>("Updated Successfully", new HttpHeaders(), HttpStatus.OK);
	}

	// Deleting Student
	@DeleteMapping("/DeleteStudent/{id}")
	private ResponseEntity<String> delStd(@PathVariable("id") int id) {
		serviceobj.removeStudent(id);
		return new ResponseEntity<String>("student deleted successfully", new HttpHeaders(), HttpStatus.OK);
	}

}
