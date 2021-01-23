package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	/**
	 * InitBinder is useful when many fields in form (It's pre processsor)
	 * Handles data before it reaches controller :)
	 * 
	 * In case only few fields -> Directly put field.trim() inside setter Method
	 * 
	 * Validation used getField() after it is set using setField()***
	 * */
	@InitBinder
	public void initBinder(WebDataBinder webBinder) {
		// true means trim down and if empty -> then mention null
		// false means trim down and if empty -> empty string 
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		System.out.println("Init Binder");
	}
	
	@RequestMapping("/form")
	public String getCustomerForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	@RequestMapping("/submit")
	public String submitForm(@Valid @ModelAttribute("customer") Customer customer,
							BindingResult bindingResult) {
		System.out.println("Binding Result: "+ bindingResult);
		if(bindingResult.hasErrors()) {
			return "customer-form";
		}else {
			return "customer-page";
		}
	}
	
}
