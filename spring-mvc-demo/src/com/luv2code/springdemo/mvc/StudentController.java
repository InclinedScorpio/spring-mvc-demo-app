package com.luv2code.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	// Picking value from util:properties from XML file (it's extracting from prop file.
	@Value("#{countriesList}")
	private Map<String, String> countriesList;
	
	@RequestMapping("/form")
	public String getForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		model.addAttribute("countriesList", this.countriesList);
		
		return "student-form";
	}
	
	@RequestMapping("/submitForm")
	public String submitForm(@ModelAttribute("student") Student MyStudent) {
		System.out.println("FirstName @ModelAttribute ==>" + MyStudent.getFirstName());
		
		return "submittedForm";
	}
	
}
