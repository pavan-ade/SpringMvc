package com.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.mvc.model.Employee;

@Component
public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		return new Employee(rs.getInt(1), rs.getString(2),rs.getDouble(3),rs.getString(4));
	}

}
