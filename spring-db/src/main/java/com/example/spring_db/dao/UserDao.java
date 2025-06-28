package com.example.spring_db.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_db.bean.UserBean;

@Repository
public interface UserDao extends JpaRepository<UserBean, Integer>{

}
