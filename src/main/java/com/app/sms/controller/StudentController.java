package com.app.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.sms.entity.Student;
import com.app.sms.service.StudentService;



@Controller
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	//build handler method to handle list students and return model and view
	@GetMapping("/students")
	public String listStudents( Model model) {
		//return view from this method
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
		
	}
    @GetMapping("/students/new")
	public String createStudentsForm(Model model) {
    	
    	//create student object to hold student form data
    	Student student = new Student();
    	model.addAttribute("student", student);
    	return "create_student";
		
    }
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student) {
    	studentService.saveStudent(student);
    	return "redirect:/students";
    	
    }
    
    @GetMapping("/students/edit/{id}")
    public String editStudent(@PathVariable Long id, Model model) {
    	model.addAttribute("student", studentService.getStudentByID(id));
		return "edit_student";
    	
    }
 
    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id,
    		@ModelAttribute ("student") Student student, Model model) {
    	
    	Student existingStudent = studentService.getStudentByID(id);
    	
    	existingStudent.setId(id);
    	
    	existingStudent.setFirstName(student.getFirstName());
    	
    	existingStudent.setLastName(student.getLastName());
    	
    	existingStudent.setEmail(student.getEmail());
    	
		//save update student object
    	
    	studentService.updateStudent(existingStudent);
    	
    	return "redirect:/students";
    	
    }
    
    //handler method to handel delete student
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {
    	studentService.deleteStudentById(id);
		return "redirect:/students";   	
    }
}
