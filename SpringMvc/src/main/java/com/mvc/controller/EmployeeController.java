package com.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.model.Employee;
import com.mvc.service.EmployeeService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@RequestMapping("/getshowAllEmployee")
	public ModelAndView getshowEmployee() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("WEB-INF/view/showEmployee.jsp");
		List<Employee> allEmployee = service.getAllEmployee();
		modelAndView.addObject("allEmployee", allEmployee);
		return modelAndView;
	}

	@RequestMapping("/addEmployee")
	public ModelAndView addEmployee() {
		Employee emp = new Employee();
		ModelAndView modelAndView = new ModelAndView("WEB-INF/view/addEmployee.jsp", "employee", emp);
		return modelAndView;
	}

	@RequestMapping("/saveEmployee")
	public String addEmployee(@Validated Employee emp, BindingResult result) {
		if (result.hasErrors()) {
			return "WEB-INF/view/addEmployee.jsp";
		}
		service.saveEmployee(emp);
		return "redirect:/getshowAllEmployee";
	}

	@RequestMapping("/deleteEmployee")
	public String deleteEmployee(HttpServletRequest request) {
		String id = request.getParameter("emp_id");

		service.deleteEmployee(Integer.parseInt(id));
		return "redirect:/getshowAllEmployee";
	}

	@RequestMapping("/showEmployee")
	public ModelAndView showEmployee(HttpServletRequest request) {

		String id = request.getParameter("emp_id");
		List<Employee> employeeById = service.getEmployeeById(Integer.valueOf(id));
		Employee employee = employeeById.get(0);
		ModelAndView modelAndView = new ModelAndView("WEB-INF/view/editEmployee.jsp", "employee", employee);

		return modelAndView;
	}

	@RequestMapping("/updateEmployee")
	public String updateEmployee(@Validated Employee emp, BindingResult result) {

		if (result.hasErrors()) {
			return "WEB-INF/view/editEmployee.jsp";
		}
		service.updateEmployee(emp);

		return "redirect:/getshowAllEmployee";
	}

	@RequestMapping("/searchEmployee")
	public ModelAndView searchEmployee(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView("WEB-INF/view/showEmployee.jsp");
		String type = request.getParameter("search_type");
		String value = request.getParameter("search_value");
		
		
		List<Employee> searchEmployee = service.searchEmployee(type, value);
		modelAndView.addObject("allEmployee", searchEmployee);

		return modelAndView;
	}
}
