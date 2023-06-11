package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home() {
		System.out.println("In Home Controller");
		System.out.println("To Access web Page  use below url: ");
		System.out.println("http://localhost:8080/home");
		return "index.jsp";
	}

}
