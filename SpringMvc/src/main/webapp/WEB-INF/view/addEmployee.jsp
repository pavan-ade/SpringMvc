<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>save Employee</title>
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
		<h1>Add Employee</h1>
		<form:form action="saveEmployee" modelAttribute="employee"  method="post">
			<div class="form-floating mb-3">
				<form:input type="text" class="form-control" path="name"
					placeholder="Name" id="floatingName" />
				<label for="floatingName">Name</label>
				<form:errors path="name"  cssClass="error"/>
			</div>
			<div class="form-floating mb-3">
				<form:input type="number" class="form-control" path="salary"
					placeholder="Salary" id="floatingAddress" />
				<label for="floatingSalary">Salary</label>
				<form:errors path="salary" cssClass="error"/>
			</div>
			<div class="form-floating mb-3">
				<form:input type="text" class="form-control" path="address"
					placeholder="address" id="floatingSalary" />
				<label for="floatingAddress">Address</label>
				<form:errors path="address" cssClass="error"/>
			</div>
			<button class="btn btn-primary" type="submit">Save Employee</button>
			<button class="btn btn-warning">
				<a href="getshowAllEmployee" class="nav-link">Cancel</a>
			</button>
		</form:form>
	</div>
</body>
</html>