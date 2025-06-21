package com.example.springbootexample.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
 
import com.example.springbootexample.bean.StudentBean;
import com.example.springbootexample.service.AdminService;
 
 
 
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private AdminService adserv;
	@GetMapping("/home")
	public String m1(Model m, StudentBean sb)
	{
		sb.setRollno(101);
		sb.setName("Vivek");
		sb.setBranch("ECE");
		m.addAttribute("student", sb);
		m.addAttribute("data","Jigyasha");
		return "UserHome";
	}
	
	@GetMapping("/selectAll")
	public String m2(Model m,StudentBean sb)
	{
		m.addAttribute("sb",sb);
		m.addAttribute("all", adserv.selectAll());
		return "selectAll";
	}
	
	@RequestMapping("/addstudent")
	public String m3(@ModelAttribute("sb") StudentBean sb) {
		adserv.addStudent(sb);
		return "success";
	}
}