<%@page import="java.util.List"%>
<%@page import="com.mvc.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update Employee</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h2>Update Employee</h2>
		<%
		List<Employee> emps = (List<Employee>) request.getAttribute("employeeById");
		    for(Employee emp : emps){
		%>


		<form action="updateEmployee" name="frm" method="post">
			<input type="hidden" name="emp_id" value='<%=emp.getId()%>'>
			<div>
				<input type="text" name="emp_name" value='<%=emp.getName()%>'
					class="form-control" id="floatingName" placeholder="Name">
				<label for="floatingName">Name</label>
			</div>
			<div>
				<input type="number" name="emp_salary" value='<%=emp.getSalary()%>'
					class="form-control" id="floatingAddress" placeholder="Salary">
				<label for="floatingAddress">Salary</label>
			</div>
			<div>
				<input type="text" name="emp_address" value='<%=emp.getAddress()%>'
					class="form-control" id="floatingSalary" placeholder="Address">
				<label for="floatingSalary">Address</label>
			</div>
			<button class="btn btn-primary" type="submit">Update</button>
			<button class="btn btn-primary">cancel</button>
		</form>
		<% } %>
	</div>
</body>
</html>