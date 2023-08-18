package com.app.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.sms.entity.Student;
import com.app.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		/*
		 * Student student1 = new Student("Swapnil", "Ugalmugale", "swapnil@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student studen2 = new Student("Pawan", "Padvi", "pawan@gmail.com");
		 * studentRepository.save(studen2);
		 * 
		 * Student student3 = new Student("Vikram", "Patil", "vikram@gmail.com");
		 * studentRepository.save(student3);
		 */
		 

	}

}
