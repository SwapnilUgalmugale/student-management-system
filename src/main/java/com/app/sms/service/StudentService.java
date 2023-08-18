package com.app.sms.service;

import java.util.List;

import com.app.sms.entity.Student;


public interface StudentService {
	
//	StudentLoginResponse authenticateUser(String email, String password);
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentByID(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
