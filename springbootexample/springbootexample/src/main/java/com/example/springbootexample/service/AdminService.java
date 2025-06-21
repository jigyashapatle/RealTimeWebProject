package com.example.springbootexample.service;
 
import java.util.ArrayList;
import java.util.Optional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.example.springbootexample.bean.StudentBean;
import com.example.springbootexample.dao.AdminDao;
 
@Service
public class AdminService {
	@Autowired                   //injecting the object
	private AdminDao adao;
	public int addStudent(StudentBean sb) {
		if(sb!=null) {
			adao.save(sb);
			return 1;
		} else {
			return 0;
		}
	}
	
	public int updateStudent(StudentBean sb) {
		if(sb!=null) {
			//optional is a class, by using this we are checking whether it is present or not
			Optional<StudentBean> opt = adao.findById(sb.getRollno());
			if(opt.isPresent()) {
				adao.save(sb);
			}
			return 1;
		} else {
			return 0;
		}
	}
	
	public ArrayList<StudentBean> selectAll(){
		return (ArrayList<StudentBean>) adao.findAll();
	}
	
	public int deleteById(int rollno) {
		if(rollno >=0) {
			adao.deleteById(rollno);
			return 1;
		} else {
			return 0;
		}
	}
	
}