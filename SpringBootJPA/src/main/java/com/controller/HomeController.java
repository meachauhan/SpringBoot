package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.controller.dao.StudentDAO;
import com.model.Student;

@Controller
public class HomeController {
	
	@Autowired
	StudentDAO studentdao;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(Student student) {
		
		studentdao.save(student);
		return "home.jsp";
		
	}
}
