package com.example;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	private StudentDao sdao;
	public int addStudent(StudentBean sb)
	{
		if(sb!=null)
		{
			sdao.save(sb);
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public int updateStudent(StudentBean sb)
	{
		if(sb!=null)
		{
			Optional<StudentBean> opt = sdao.findById(sb.getRollno());
			if(opt.isPresent())
			{
				sdao.save(sb);
				return 1;
			}
		}
		return 0;
	}
	
	public ArrayList<StudentBean> selectAll()
	{
		return (ArrayList<StudentBean>) sdao.findAll();
	}
	
	public StudentBean selectByRollno(int rollno)
	{
		StudentBean sb1 = new StudentBean();
		Optional<StudentBean> s = sdao.findById(rollno);
		if(s.isPresent())
		{
			sb1 = s.get();
		}
		return sb1;
	}
	
	public int deleteStudent(int rollno)
	{
		if(rollno!=0)
		{
			sdao.deleteById(rollno);
			return 1;
		}
		else
		{
			return 0;
		}
	}
}