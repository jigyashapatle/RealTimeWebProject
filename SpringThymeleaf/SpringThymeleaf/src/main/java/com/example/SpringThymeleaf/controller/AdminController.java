package com.example.SpringThymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringThymeleaf.bean.EmployeeBean;
import com.example.SpringThymeleaf.service.AdminService;

@Controller

public class AdminController {
	@Autowired
	private AdminService adserv;
@GetMapping("/first")
public String meth()
{
	return "index";
}
@GetMapping("/addEmp")
public String meth2(@ModelAttribute("eb")EmployeeBean eb, Model m)
{
	m.addAttribute("aaa",adserv.adEmployee(eb)+" record inserted");
	return "success";
}
@GetMapping("/hello")
public String meth1(Model m,EmployeeBean eb)

{
   eb.setEid(101);
   eb.setEname("Karthik");
   eb.setEsal(56000);
   m.addAttribute("emp",eb);
   m.addAttribute("name","Ismail");
   return "Welcome";
}
@GetMapping("/selectAll")
public String meth4(Model m)
{
	m.addAttribute("all",adserv.selectAll());
	return "selectAll";
}
}