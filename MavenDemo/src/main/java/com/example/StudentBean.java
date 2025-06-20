package com.example;

import org.springframework.stereotype.Component;
import jakarta.persistence.*;


@Component(value="sb1")
@Entity
@Table(name="student111")
public class StudentBean {
	@Id
	@GeneratedValue
	private int rollno;
	@Column
	private String name;
	@Column
	private String branch;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
}
