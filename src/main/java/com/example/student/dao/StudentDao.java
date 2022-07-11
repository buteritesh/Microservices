package com.example.student.dao;

import com.example.student.entity.Student;

public interface StudentDao {
	public boolean saveStudent(Student student);
	public Student getStudent(int studentId);

}
