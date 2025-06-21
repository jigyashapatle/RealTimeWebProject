package com.example.SpringThymeleaf.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringThymeleaf.bean.EmployeeBean;
import com.example.SpringThymeleaf.dao.AdminDao;

@Service
public class AdminService {
	@Autowired
	private AdminDao adao;
	public int adEmployee(EmployeeBean eb)
	{
		if(eb!=null)
		{
			adao.save(eb);
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public int updateEmployee(EmployeeBean eb)
	{
		if(eb!=null)
		{
			Optional<EmployeeBean> opt = adao.findById(eb.getEid());
			if(opt.isPresent())
			{
				adao.save(eb);
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public int deleteEmpById(int eid)
	{
		if(eid!=0)
		{
			adao.deleteById(eid);
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	
	public EmployeeBean selectByEmpId(int eid)
	{
		EmployeeBean e=new EmployeeBean();
		Optional<EmployeeBean> opt = adao.findById(eid);
		if(opt.isPresent())
		{
			e=opt.get();
		}
		return e;
	}
	
	
	public ArrayList<EmployeeBean> selectAll()
	{
	   return (ArrayList<EmployeeBean>) adao.findAll();
	}
}