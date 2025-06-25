package com.example;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
//		EmployeeBean emp=(EmployeeBean)ctx.getBean("emp");
//		EmployeeDAO edao=(EmployeeDAO)ctx.getBean("edao");
//		emp.setEmpid(101);
//		emp.setEmpname("Praveen");
//		emp.setEmpsalary(56000);
//		System.out.println(edao.addEmployee(emp)+" record inserted successfully...");
		
		
//		emp.setEmpid(101);
//		emp.setEmpname("Jigyasha");
//		emp.setEmpsalary(78000);
//		System.out.println(edao.updateEmployee(emp)+" record updated successfully...");
		
//		emp.setEmpid(101);
//		System.out.println(edao.deleteEmployee(101)+" record deleted successfully...");
		
//		ArrayList<EmployeeBean> all=edao.selectAll();
//		for(EmployeeBean eb:all)
//		{
//			System.out.println(eb.getEmpid()+" "+eb.getEmpname()+" "+eb.getEmpsalary());
//		}
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(DBConfig.class);
		EmployeeBean eb=(EmployeeBean)ctx.getBean("emp");
		EmployeeDAO edao=(EmployeeDAO)ctx.getBean(EmployeeDAO.class);
		ArrayList<EmployeeBean> all=edao.selectAll();
		for(EmployeeBean eb1:all)
		{
			System.out.println(eb1.getEmpid()+" "+eb1.getEmpname()+" "+eb1.getEmpsalary());
		}
	}
}