package com.example.student.service;

import com.example.student.entity.Student;
import com.example.student.model.StudentBranch;

public interface StudentService {
	
	public boolean saveStudent(Student student);
	public Student getStudent(int studentId);
    public StudentBranch getStudentBranch(int studentId);
}
