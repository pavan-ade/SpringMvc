package com.mvc.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.mvc.model.Employee;

@Component
public interface EmployeeDAO {
	
	public List<Employee> getAllEmployee();
	public void saveEmployee(Employee emp);
	public void deleteEmployee(Integer id);
	public void updateEmployee(Employee emp);
	public List<Employee> getEmployeeById(Integer id);
	public List<Employee> getEmployeeByName(String name);
	public List<Employee> getEmployeeByAddress(String address);
	public List<Employee>  getEmployeeBySalary(String type,Double salary);
	
	
}
