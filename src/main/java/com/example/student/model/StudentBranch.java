package com.example.student.model;

import com.example.student.entity.Student;

public class StudentBranch {
	
	Student student;
	Branch branch;
	public StudentBranch() {
		super();
	}
	public StudentBranch(Student student, Branch branch) {
		super();
		this.student = student;
		this.branch = branch;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "StudentBranch [student=" + student + ", branch=" + branch + "]";
	}
	

}
