package com.example.spring_db.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_db.bean.UserBean;
import com.example.spring_db.service.UserService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userv;
	@PostMapping("/save")
	public String meth1(@RequestBody UserBean ub)
	{
		System.out.println(ub);
		return userv.addUser(ub)+" record inserted successfully";
	}
	
	@GetMapping("/selectAll")
	public ArrayList<UserBean> meth2()
	{
		return userv.selectAll();
	}
}
