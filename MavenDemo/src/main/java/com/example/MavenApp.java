package com.example;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class MavenApp{
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =  SpringApplication.run(MavenApp.class, args);
//		StudentBean sb = (StudentBean)ctx.getBean(StudentBean.class);
		StudentBean sb = (StudentBean)ctx.getBean("sb1");
		StudentService stuserv = (StudentService)ctx.getBean(StudentService.class);
//		sb.setName("Vijay");
//		sb.setBranch("CSE");
		
		/* System.out.println(sb.getRollno()+" "+sb.getName()+" "+sb.getBranch()); */	
		
//		sb.setName("Praveen");
//		sb.setBranch("EEE");
//		System.out.println(stuserv.addStudent(sb)+" record inserted successfully");
		
		
//		sb.setRollno(1);
//		sb.setName("Manoj");
//		sb.setBranch("Mech");
//		System.out.println(stuserv.updateStudent(sb)+" record updated successfully");
		
//		ArrayList<StudentBean> all = stuserv.selectAll();
//		for(StudentBean s:all)
//		{
//			System.out.println(s.getRollno()+" "+s.getName()+" "+s.getBranch());
//		}
		
//		StudentBean ss = stuserv.selectByRollno(2);
//		System.out.println(ss.getRollno()+" "+ss.getName()+" "+ss.getBranch());
		
		System.out.println(stuserv.deleteStudent(2)+" record deleted succussfully");
	}
}