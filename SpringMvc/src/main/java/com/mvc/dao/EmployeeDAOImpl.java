package com.mvc.dao;

import static com.mvc.constains.Queries.SELECT;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.mvc.model.Employee;


public class EmployeeDAOImpl extends JdbcDaoSupport implements EmployeeDAO{

	@Autowired
	EmployeeRowMapper rowmapper;

	@Autowired
	public EmployeeDAOImpl(DataSource datasource) {
		setDataSource(datasource);
	}
	
	@Override
	public List<Employee> getAllEmployee() {
		
		return getJdbcTemplate().query(SELECT, rowmapper);
	}

}
