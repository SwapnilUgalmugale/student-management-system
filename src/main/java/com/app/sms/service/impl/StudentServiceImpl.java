package com.app.sms.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.app.sms.cust_exce.UserHandlingException;
import com.app.sms.entity.Student;
import com.app.sms.repository.StudentRepository;
import com.app.sms.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;
	

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	/*
	 * @Override public StudentLoginResponse authenticateUser(String email, String
	 * password) { // TODO Auto-generated method stub Student S1 =
	 * (studentRepository.findByEmailAndPassword(email, password) .orElseThrow(()->
	 * new UserHandlingException(" Invalid Credentials ")));
	 * 
	 * StudentLoginResponse S = new StudentLoginResponse();
	 * BeanUtils.copyProperties(S1, S);
	 * 
	 * return p; }
	 */


	@Override
	public List<Student> getAllStudents() {
		// method for get all students
		return studentRepository.findAll(); 
	}


	@Override
	public Student saveStudent(Student student) {
		// method for save student
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentByID(Long id) {
		//method for get stu by id
		return studentRepository.findById(id).get();
	}


	@Override
	public Student updateStudent(Student student) {
		// method for update student
		return studentRepository.save(student);
	}


	@Override
	public void deleteStudentById(Long id) {
		// method for delete student
		studentRepository.deleteById(id);
	}


	

}
