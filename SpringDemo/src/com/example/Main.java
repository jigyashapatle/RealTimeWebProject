package com.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class Main {
public static void main(String[] args) {
	//using xml...
//    ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");//Initialize the container
//	  HelloWorld h1=(HelloWorld)ctx.getBean("hw");
//    HelloWorld h2=ctx.getBean(HelloWorld.class);
//    h1.setMsg("Welcome to Mphasis");
//    System.out.println(h1.getMsg());
//    h2.setMsg("welcome...");
//    System.out.println(h2.getMsg());
	
	//using Annotation...
//	ApplicationContext ctx=new AnnotationConfigApplicationContext(HelloWorldConfig.class);
//	HelloWorld h1=(HelloWorld)ctx.getBean(HelloWorld.class);
//	HelloWorld h2=(HelloWorld)ctx.getBean("hw");
//	h1.setMsg("Welcome to Spring");
//	System.out.println(h1.getMsg());
//	h2.setMsg("Welcome...");
//	System.out.println(h2.getMsg());
	
	BeanFactory ctx=new XmlBeanFactory(new ClassPathResource("beans.xml"));
	Display d=(Display)ctx.getBean("d");
	d.disp();  
 }
}