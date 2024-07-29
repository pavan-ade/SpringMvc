package com.mvc.dao;

import static com.mvc.constains.Queries.DELETE;
import static com.mvc.constains.Queries.INSERT;
import static com.mvc.constains.Queries.SELECT;
import static com.mvc.constains.Queries.SELECTBYADDRESS;
import static com.mvc.constains.Queries.SELECTBYID;
import static com.mvc.constains.Queries.SELECTBYNAME;
import static com.mvc.constains.Queries.SELECTBYSALARY;
import static com.mvc.constains.Queries.SELECTBYSALARYGREATERTHAN;
import static com.mvc.constains.Queries.SELECTBYSALARYLESSTHAN;
import static com.mvc.constains.Queries.UPDATE;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.mvc.model.Employee;

public class EmployeeDAOImpl extends JdbcDaoSupport implements EmployeeDAO {
	private EmployeeRowMapper rowmapper;
	
	@Autowired
	public EmployeeDAOImpl(EmployeeRowMapper rowmapper) {
		this.rowmapper = rowmapper;
	}
	
 	public EmployeeDAOImpl(DataSource datasource) {
		setDataSource(datasource);
		
	}
 	
 	
 	
	@Override
	public List<Employee> getAllEmployee() {
		return getJdbcTemplate().query(SELECT, rowmapper);
		 
	}

	@Override
	public void saveEmployee(Employee emp) {
		getJdbcTemplate().update(INSERT, emp.getName(), emp.getSalary(), emp.getAddress());
	}

	@Override
	public void deleteEmployee(Integer id) {
		getJdbcTemplate().update(DELETE, id);
	}

	@Override
	public void updateEmployee(Employee emp) {
		getJdbcTemplate().update(UPDATE, emp.getName(), emp.getSalary(), emp.getAddress(), emp.getId());

	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Employee> getEmployeeById(Integer id) {
		return getJdbcTemplate().query(SELECTBYID, new Object[] { id }, rowmapper);

	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Employee> getEmployeeByName(String name) {
		return getJdbcTemplate().query(SELECTBYNAME, new Object[] { ("%" + name) }, rowmapper);

	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Employee> getEmployeeBySalary(String type, Double salary) {

		if (type.equals(">="))
			return getJdbcTemplate().query(SELECTBYSALARYGREATERTHAN, new Object[] { salary }, rowmapper);
		else if (type.equals("<="))
			return getJdbcTemplate().query(SELECTBYSALARYLESSTHAN, new Object[] { salary }, rowmapper);
		else if (type.equals("="))
			return getJdbcTemplate().query(SELECTBYSALARY, new Object[] { salary }, rowmapper);

		return new ArrayList<>();
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Employee> getEmployeeByAddress(String address) {
		return getJdbcTemplate().query(SELECTBYADDRESS, new Object[] { address }, rowmapper);

	}

}
