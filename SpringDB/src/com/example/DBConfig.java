package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DBConfig {
	@Bean
	public DriverManagerDataSource meth1()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/mphasis");
		ds.setUsername("root");
		ds.setPassword("Password@12");
		return ds;
	}
	
	@Bean
	public JdbcTemplate meth2()
	{
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(meth1());
		return jdbcTemplate;
	}
	
	@Bean
	public EmployeeDAO meth3()
	{
		EmployeeDAO edao=new EmployeeDAO();
		edao.setJdbcTemplate(meth2());
		return edao;
	}
	
	@Bean(name="emp")
	public EmployeeBean meth4()
	{
		return new EmployeeBean();
	}
}
