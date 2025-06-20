package com.mphasis.dao;



import java.util.ArrayList;

import java.util.List;



import org.hibernate.Session;

import org.hibernate.Transaction;

import org.hibernate.query.Query;



import com.mphasis.dbutil.HibernateUtil;

import com.mphasis.domain.Product;



public class ProductManagementDAO {

public static String msg="";

public static String addProduct(Product pd)

{

if(pd!=null)

{

Session s=HibernateUtil.open();

Transaction t=s.beginTransaction();

s.save(pd);

msg="Product added successfully";

t.commit();

HibernateUtil.close();

return msg;

}

else

 {

 msg="Product not added";

return msg;

}

}

public static String updateProduct(Product pd)

{

if(pd!=null)

{

Session s=HibernateUtil.open();

Transaction t=s.beginTransaction();

s.update(pd);

msg="Product updated successfully";

t.commit();

HibernateUtil.close();

return msg;

}

else

 {

 msg="Product not updated";

return msg;

}





}

public static String deleteProduct(String pid)

{

int i=0;

if(pid!="")

{

Session s=HibernateUtil.open();

Transaction t=s.beginTransaction();

Query q=s.createQuery("delete from Product where productid=:prodid");

q.setParameter("prodid", pid);

i=q.executeUpdate();

if(i==1)

{

msg="Product Deleted Successfully";

}

else

 {

 msg="Product not deleted";

}

t.commit();

HibernateUtil.close();



}

return msg;

}

public static Product selectProductById(String pid)

{

Product pr=new Product();

Session s=HibernateUtil.open();

Transaction t=s.beginTransaction();

Query <Product> q=s.createQuery("from Product where productid=:prodid");

q.setParameter("prodid",pid);

List<Product> l=q.list();

for(Product p:l)

{

pr.setProductid(p.getProductid());

pr.setProductname(p.getProductname());

pr.setProductprice(p.getProductprice()); 

}

return pr;

}

public static ArrayList<Product> selectAll()

{

ArrayList<Product> al=new ArrayList<Product>();

Session s=HibernateUtil.open();

Transaction t=s.beginTransaction();

Query q=s.createQuery("from Product");

al=(ArrayList<Product>)q.list();

return al;

}

}