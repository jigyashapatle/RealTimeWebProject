package com.mphasis.dbutil;

import org.hibernate.cfg.Configuration;

import org.hibernate.SessionFactory;

import org.hibernate.Session;

public class HibernateUtil {
	public static Configuration config;
	public static SessionFactory sf;
	public static Session s;
	public static Session open()
	{
		config=new Configuration().configure("/com/mphasis/dbutil/hibernate.cfg.xml");
		sf=config.buildSessionFactory();
		s=sf.openSession();
		return s;
	}
	public static void close()
	{
		s.close();
	}
}
