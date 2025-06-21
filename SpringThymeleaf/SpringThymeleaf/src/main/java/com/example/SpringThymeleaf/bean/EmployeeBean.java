package com.example.SpringThymeleaf.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="emp514")
public class EmployeeBean {
	@Id
	@GeneratedValue
private int eid;
	@Column
private String ename;
	@Column
private int esal;
public int getEid() {
return eid;
}
public void setEid(int eid) {
this.eid = eid;
}
public String getEname() {
return ename;
}
public void setEname(String ename) {
this.ename = ename;
}
public int getEsal() {
return esal;
}
public void setEsal(int esal) {
this.esal = esal;
}
}