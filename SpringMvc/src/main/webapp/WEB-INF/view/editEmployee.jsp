<%@page import="java.util.List"%>
<%@page import="com.mvc.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update Employee</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h2>Update Employee</h2>

		<form:form action="updateEmployee" modelAttribute="employee"
			name="frm" method="post">
			<input type="hidden" name="emp_id">
			<div>
				<label for="floatingName">Name</label>
				<form:input type="text" path="name" class="form-control"
					id="floatingName" placeholder="Name" />
				<form:errors path="name" cssClass="error" />

			</div>
			<div>
				<label for="floatingAddress">Salary</label>
				<form:input type="number" path="salary" class="form-control"
					id="floatingAddress" placeholder="Salary" />
				<form:errors path="salary" cssClass="error" />
			</div>
			<div>
				<label for="floatingSalary">Address</label>
				<form:input type="text" path="Address" class="form-control"
					id="floatingSalary" placeholder="Address" />
				<form:errors path="Address" cssClass="error" />
			</div>
			<button class="btn btn-primary" type="submit">Update</button>
			<button class="btn btn-primary" >
				<a href="getshowAllEmployee" class="nav-link">Cancel</a>
			</button>
		</form:form>

	</div>
</body>
</html>