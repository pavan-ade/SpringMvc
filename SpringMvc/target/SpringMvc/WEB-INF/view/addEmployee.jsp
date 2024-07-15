<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>save Employee</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Add Employee</h1>
		<form action="saveEmployee">
			<div class="form-floating mb-3">
				<input type="text" name="emp_name" placeholder="Name"
					id="floatingName"> <label for="floatingName">Name</label>
			</div>
			<div class="form-floating mb-3">
				<input type="number" name="emp_salary" placeholder="Salary"
					id="floatingAddress"> <label for="floatingSalary">Salary</label>
			</div>
			<div class="form-floating mb-3">
				<input type="text" name="emp_address" placeholder="address"
					id="floatingSalary"> <label for="floatingAddress">Address</label>
			</div>
			<button class="btn btn-primary" type="submit">Save Employee</button>
		</form>
	</div>
</body>
</html>