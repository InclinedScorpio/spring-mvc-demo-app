package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloworldController {

	@RequestMapping("/hello-form")
	public String getform() {
		return "hello-form";
	}
	
	@RequestMapping("/helloServletRequest")
	public String getHello(HttpServletRequest request, Model model) {
		String username = request.getParameter("username");
		
		username = "Yo! "+ username.toUpperCase();
		model.addAttribute("username", username);
		
		return "hello";
	}
	
	@RequestMapping("/helloReqParam")
	public String getHello2(@RequestParam("username") String username, Model model) {
		String nameUpper = "Yo There ## "+ username.toUpperCase();
		model.addAttribute("username", nameUpper);
		return "hello";
	}
	
}
