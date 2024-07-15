package com.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.dao.EmployeeDAO;
import com.mvc.model.Employee;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeDAO empdao;
	
	@RequestMapping("/getshowEmployee")
	public ModelAndView  getshowEmployee() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("WEB-INF/view/showEmployee.jsp");
		List<Employee> allEmployee = empdao.getAllEmployee();
		 modelAndView.addObject("allEmployee",allEmployee);
		 return modelAndView;
	}
	
	@RequestMapping("/addEmployee")
	public ModelAndView addEmployee() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("WEB-INF/view/addEmployee.jsp");
		return modelAndView;
	}
	
	@RequestMapping("/saveEmployee")
	public String addEmployee(HttpServletRequest request) {
		String name = request.getParameter("emp_name");
		String salary = request.getParameter("emp_salary");
		String address = request.getParameter("emp_address");
		Employee emp = new Employee(name, Double.parseDouble(salary), address);   
		empdao.saveEmployee(emp);
		return "redirect:/getshowEmployee";
	}
	
}
