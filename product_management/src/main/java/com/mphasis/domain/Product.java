package com.mphasis.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="product")
public class Product {
@Id
private String productid;
@Column
private String productname;
@Column
private int productprice;
public String getProductid() {
	return productid;
}
public void setProductid(String productid) {
	this.productid = productid;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public int getProductprice() {
	return productprice;
}
public void setProductprice(int productprice) {
	this.productprice = productprice;
}
}
