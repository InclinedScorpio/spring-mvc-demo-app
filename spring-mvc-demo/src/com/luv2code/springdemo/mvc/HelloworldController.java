package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloworldController {

	@RequestMapping("/hello-form")
	public String getform() {
		return "hello-form";
	}
	
	@RequestMapping("/hello")
	public String getHello(HttpServletRequest request, Model model) {
		String username = request.getParameter("username");
		
		username = "Yo! "+ username.toUpperCase();
		model.addAttribute("username", username);
		
		return "hello";
	}
	
}
