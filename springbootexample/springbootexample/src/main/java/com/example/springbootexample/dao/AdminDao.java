package com.example.springbootexample.dao;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.example.springbootexample.bean.StudentBean;
 
@Repository
public interface AdminDao extends JpaRepository<StudentBean, Integer>{
	
}