package com.mvc.dao;

import static com.mvc.constains.Queries.INSERT;
import static com.mvc.constains.Queries.SELECT;
import static com.mvc.constains.Queries.DELETE;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.mvc.model.Employee;

public class EmployeeDAOImpl extends JdbcDaoSupport implements EmployeeDAO {

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

	@Override
	public void saveEmployee(Employee emp) {
		getJdbcTemplate().update(INSERT, emp.getName(), emp.getSalary(), emp.getAddress() );
	}

	@Override
	public void deleteEmployee(Integer id) {
		getJdbcTemplate().update(DELETE, id);
	}

}
