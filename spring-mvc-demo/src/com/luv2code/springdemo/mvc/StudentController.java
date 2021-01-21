package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/form")
	public String getForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		
		return "student-form";
	}
	
	@RequestMapping("/submitForm")
	public String submitForm(@ModelAttribute("student") Student MyStudent) {
		System.out.println("FirstName @ModelAttribute ==>" + MyStudent.getFirstName());
		
		return "submittedForm";
	}
	
}
