package com.mphasis.app;
import com.mphasis.dao.ProductManagementDAO;
import com.mphasis.domain.Product;
import java.util.*;

public class ProductManagementApp {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
char choice;
	System.out.println("A. View Product");
	System.out.println("B. Add Product");
	System.out.println("C. Update Product");
	System.out.println("D. Delete Product");
	System.out.println("E. Search Product");
	System.out.println("F. Exit");
	System.out.println("Enter your choice");
	choice = sc.next().toUpperCase().charAt(0);
switch(choice)
{
case 'A':
	ArrayList<Product> all=ProductManagementDAO.selectAll();
    for(Product p:all)
    {
       System.out.println("Product ID "+p.getProductid());
       System.out.println("Product Name "+p.getProductname());
       System.out.println("Product Price "+p.getProductprice());
 } 
case 'B':
	 System.out.println("Enter Product ID");
	 String pid=sc.next();
	 System.out.println("Enter Product Name");
	 String pname=sc.next();
	 System.out.println("Enter Product Price");
	 int pprice=sc.nextInt();
	 Product p=new Product();
	 p.setProductid(pid);
	 p.setProductname(pname);
	 p.setProductprice(pprice);
	 System.out.println(ProductManagementDAO.addProduct(p));
	 
}
// System.out.println("Enter Product ID");
// String pid=sc.next();
// System.out.println("Enter Product Name");
// String pname=sc.next();
// System.out.println("Enter Product Price");
// int pprice=sc.nextInt();
// Product p=new Product();
// p.setProductid(pid);
// p.setProductname(pname);
// p.setProductprice(pprice);
// System.out.println(ProductManagementDAO.addProduct(p));
//	System.out.println("------------------------------------------------------");
//	System.out.println("View All");
//	ArrayList<Product> all=ProductManagementDAO.selectAll();
// for(Product p:all)
// {
// System.out.println("Product ID "+p.getProductid());
// System.out.println("Product Name "+p.getProductname());
// System.out.println("Product Price "+p.getProductprice());
// }
// System.out.println("--------------------------------------------------------");
// System.out.println("Delete Product");
// System.out.println("Enter Product ID");
// String pid=sc.next();
// System.out.println(ProductManagementDAO.deleteProduct(pid));
// System.out.println("-------------------------------------------------------------");
// System.out.println("Update Product");
// System.out.println("Enter Product ID");
// String pid=sc.next();
// System.out.println("Enter Product Name");
// String pname=sc.next();
// System.out.println("Enter Product Price");
// int pprice=sc.nextInt();
// Product p=new Product();
// p.setProductid(pid);
// p.setProductname(pname);
// p.setProductprice(pprice);
// System.out.println(ProductManagementDAO.updateProduct(p));
//    System.out.println("Enter Product ID");
// String pid=sc.next();
	/*
	 * System.out.println("-----------------------------------------------------");
	 * System.out.println("Select Particular Product");
	 * System.out.println("Enter Product ID"); String pid=sc.next(); Product
	 * p1=ProductManagementDAO.selectProductById(pid);
	 * System.out.println("Product ID "+p1.getProductid());
	 * System.out.println("Product Name "+p1.getProductname());
	 * System.out.println("Product Price "+p1.getProductprice());
	 */



    //Exit 
	//System.exit(0);
	}
}