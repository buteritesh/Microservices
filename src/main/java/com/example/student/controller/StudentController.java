package com.example.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.entity.Student;
import com.example.student.model.StudentBranch;
import com.example.student.service.StudentService;

@RestController
@RequestMapping(value="/student")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping(value="/saveStudent")
	public ResponseEntity<String> saveStudent(@RequestBody Student student){
		boolean b=service.saveStudent(student);
		if(b) {
			return new ResponseEntity<String>("saved!!",HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<String>("Not saved!!",HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}
	@GetMapping(value="/getStudent")
	public ResponseEntity<Student> getStudent(@RequestParam int studentId){
		Student student=service.getStudent(studentId);
		if(student!=null) {
			return new ResponseEntity<Student>(student,HttpStatus.OK);
			
		}else {
			return new ResponseEntity<Student>(student,HttpStatus.NO_CONTENT);
		}
		
	}
	@GetMapping(value="/getStudentBranch")
	public ResponseEntity<StudentBranch> getStudentBranch(@RequestParam int studentId){
		StudentBranch studentBranch=service.getStudentBranch(studentId);
		if(studentBranch!=null) {
			return new ResponseEntity<StudentBranch>(studentBranch,HttpStatus.OK);
			
		}else {
			return new ResponseEntity<StudentBranch>(studentBranch,HttpStatus.NO_CONTENT);
		}
		
	}
	

}
