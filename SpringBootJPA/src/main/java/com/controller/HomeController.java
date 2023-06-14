package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	@RequestMapping("/students")
	@ResponseBody
	public List<Student> allStudent(){
		
		return studentdao.findAll();
	}
	@RequestMapping("/student/{sid}")
	@ResponseBody
	public Optional<Student> showStudent(@PathVariable int sid ) {
		return studentdao.findById(sid);
	}
}
