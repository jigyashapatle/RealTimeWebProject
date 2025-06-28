package com.example.spring_db.bean;

import jakarta.persistence.*;

@Entity
@Table(name="user123")
public class UserBean {
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String user;
	@Column
	private String pass;
	@Column
	private boolean gender;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
}