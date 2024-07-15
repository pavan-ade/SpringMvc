package com.mvc.dao;

import java.util.List;

import com.mvc.model.Employee;

public interface EmployeeDAO {
	public List<Employee> getAllEmployee();
	public void saveEmployee(Employee emp);
	public void deleteEmployee(Integer id);
}
