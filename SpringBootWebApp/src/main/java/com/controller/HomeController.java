package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public ModelAndView home(@RequestParam("name") String name) {
		System.out.println("In Home Controller");
		System.out.println("To Access web Page  use below url: ");
		System.out.println("http://localhost:8080/home");
		ModelAndView mv=new ModelAndView();
		mv.addObject("name",name);
		mv.setViewName("index");
		return mv;
	}

}
