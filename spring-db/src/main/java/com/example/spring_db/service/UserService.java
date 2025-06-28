package com.example.spring_db.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_db.bean.UserBean;
import com.example.spring_db.dao.UserDao;

@Service
public class UserService 
{
   @Autowired
   private UserDao udao;
   public int addUser(UserBean ub)
   {
      if(ub!=null)
      {
        udao.save(ub);
        return 1;
      }
      else
      {
       return 0;
      }
}

   public ArrayList<UserBean> selectAll()
   {
      return (ArrayList<UserBean>) udao.findAll();
   }
}