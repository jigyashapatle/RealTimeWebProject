package com.example;

import org.hibernate.Transaction;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Main {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		EmployeeBean eb=new EmployeeBean();
		eb.setEmpid(101);
		eb.setEmpname("Karthik");
		eb.setEmpSalary(45000);
		s.save(eb); 
	}
}
