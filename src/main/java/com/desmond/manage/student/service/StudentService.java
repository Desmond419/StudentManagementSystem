package com.desmond.manage.student.service;

import java.util.List;

import com.desmond.manage.student.model.Student;

public interface StudentService {
	public List<Student> getAllStudent();
    public void addStudent(Student student);
    public void deleteStudentById(int id);
}