package com.example.springbootexample.controller;
 
import java.util.ArrayList;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.example.springbootexample.bean.StudentBean;
import com.example.springbootexample.service.AdminService;
 
@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService adserv;
	@GetMapping("/welcome")
	public String meth1()
	{
		return "<h1>Welcome to spring Boot Application</h1>";
	}
	
	@PostMapping("/addStudent")
	public String meth2(@RequestBody StudentBean sb) {
		return "<h1>"+adserv.addStudent(sb)+"record inserted successfully</h1>";
	}
	
//	@RequestMapping("/addStudent")
//	public String meth2(@ModelAttribute("sb")StudentBean sb) {
//		//with the help of model attribute, we are passing all the values to bean and
//		//bean obj is passed to the service
//		return "<h1>"+adserv.addStudent(sb)+" record inserted</h1>";
//	}
	
	@PutMapping("/updateStudent")
	public String meth3(@RequestBody StudentBean sb) {
		return "<h1>"+adserv.updateStudent(sb)+" record updated successfully</h1>";
	}
	
	@GetMapping("/selectAll")
	public ArrayList<StudentBean> meth4() {
		return adserv.selectAll();
	}
	
	@DeleteMapping("/deleteStudent/{rno}")
	public String meth5(@PathVariable int rno) {
		//we can delete the record by using any value or
		return "<h1>"+adserv.deleteById(rno)+" deleted successfully";
	}
}