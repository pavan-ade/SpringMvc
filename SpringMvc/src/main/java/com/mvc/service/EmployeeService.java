package com.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.dao.EmployeeDAOImpl;
import com.mvc.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDAOImpl dao;

	public List<Employee> getAllEmployee() {
		return dao.getAllEmployee();
	}
	
	public List<Employee> getEmployeeById(Integer id) {
		return dao.getEmployeeById(id);
	}
	
	public void saveEmployee(Employee emp) {
		dao.saveEmployee(emp);
	}

	public void deleteEmployee(Integer id) {
		dao.deleteEmployee(id);
	}

	public void updateEmployee(Employee emp) {
		dao.updateEmployee(emp);
	}

	public List<Employee> searchEmployee(String type, String value) {

		if (type.equals("name")) {
			return dao.getEmployeeByName(value);
		} else if (type.equals("id")) {
			return dao.getEmployeeById(Integer.valueOf(value));
		} else if (type.equals("address")) {
			return dao.getEmployeeByAddress(value);
		} else if (type.equals(">=") || type.equals("<=") || type.equals("=")) {
			return dao.getEmployeeBySalary(type, Double.valueOf(value));
		}
		return null;
	}

}
