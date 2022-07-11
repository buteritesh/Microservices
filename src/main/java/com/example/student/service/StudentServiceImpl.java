package com.example.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.student.dao.StudentDao;
import com.example.student.entity.Student;
import com.example.student.model.Branch;
import com.example.student.model.StudentBranch;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao dao;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public boolean saveStudent(Student student) {

		return dao.saveStudent(student);
	}

	@Override
	public Student getStudent(int studentId) {

		return dao.getStudent(studentId);
	}

	@Override
	public StudentBranch getStudentBranch(int studentId) {
		Student student = dao.getStudent(studentId);
		Branch branch = restTemplate
				.getForObject("http://localhost:8081/branch/getBranch?branchId=" + student.getBranchId(), Branch.class);

		StudentBranch studentBranch = new StudentBranch(student, branch);

		return studentBranch;
	}

}
