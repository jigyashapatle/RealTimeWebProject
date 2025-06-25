package com.example;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDAO {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int addEmployee(EmployeeBean eb)
	{
		return jdbcTemplate.update("insert into employeee values('"+eb.getEmpid()+"','"+eb.getEmpname()+"','"+eb.getEmpsalary()+"')");
	}
	
	public int updateEmployee(EmployeeBean eb)
	{
		return jdbcTemplate.update("update employeee set name='"+eb.getEmpname()+"',salary='"+eb.getEmpsalary()+"' where id='"+eb.getEmpid()+"'");
	}
	
//	public int updateEmployee(EmployeeBean eb)
//	{
//		jdbcTemplate.execute("update employee set name=?,salary=? where id=?",
//
//	 new PreparedStatementCallback<EmployeeBean>() {
//	 @Override
//	 public EmployeeBean doInPreparedStatement(PreparedStatement ps)
//	 throws SQLException, DataAccessException {
//	 ps.setString(1,eb.getEmpname());
//	 ps.setInt(2, eb.getEmpsalary());
//	 ps.setInt(3, eb.getEmpid());
//	 i=ps.executeUpdate();
//	 return null;
//	 }
//		});
//		return i;
//	}
	
	int i=0;
	public int deleteEmployee(int empid)
	{
		jdbcTemplate.execute("delete from employeee where id=?",
		new PreparedStatementCallback<EmployeeBean>() {
			@Override
			public EmployeeBean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, empid);
				i=ps.executeUpdate();
				return null;
			}
		});
		return i;
	}
	
	public ArrayList<EmployeeBean> selectAll()
	{
		ArrayList<EmployeeBean> al=new ArrayList<EmployeeBean>();
	    jdbcTemplate.query("select * from employeee", new RowMapper<EmployeeBean>() {
		@Override
		public EmployeeBean mapRow(ResultSet rs, int rownum) throws SQLException {
	 EmployeeBean eb=new EmployeeBean();
	 eb.setEmpid(rs.getInt(1));
	 eb.setEmpname(rs.getString(2));
	 eb.setEmpsalary(rs.getInt(3));
	 al.add(eb);
	 return null;
		}
	});
	return al;
	}
}
