package com.nit.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeController {

	
	//to return logical view name i have to take the return type as string
	
	@RequestMapping("/")
	//@RequestMapping("/home")
	
	
	public String  showHomePage() {
		//return logical view name
		
		return "welcome";
		
	}
	
}
