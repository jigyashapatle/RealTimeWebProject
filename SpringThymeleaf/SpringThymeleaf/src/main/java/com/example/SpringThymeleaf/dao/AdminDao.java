package com.example.SpringThymeleaf.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringThymeleaf.bean.EmployeeBean;

@Repository
public interface AdminDao extends JpaRepository<EmployeeBean, Integer>{
	
}