<%@page import="java.util.List"%>
<%@page import="com.mvc.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>show Employees</title>
</head>
<style>
h1, h2 {
	text-align: center;
}
</style>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<script type="text/javascript">
	function actionFrom(formName, id) {
		if (id === 0) {

			if (formName === "addEmployee") {
				document.frm.action = formName;
			} else if (formName === "searchEmployee") {
				document.frm.action = formName;
			}

		} else {
			if (formName === 'deleteEmployee') {
				if (confirm("Do you Want to delete it ?")) {
					document.frm.emp_id.value = id;
					document.frm.action = formName;
				} else {
					document.frm.action = 'getshowAllEmployee';
				}

			} else if (formName === 'showEmployee') {
				document.frm.emp_id.value = id;
				document.frm.action = formName;
			}
		}
		document.frm.submit();

	}
</script>
<body>
	<div class="container-fluid">

		<button class="btn btn-dark">
			<a href="getshowAllEmployee" class="nav-link">Home</a>
		</button>

		<h1 class="display-2">Employee Management System</h1>
		<br>
		<form name="frm"  class="row g-3" method="post">
			<input type="hidden" name="emp_id">

			<div class="d-flex">
				<div class="p-2 flex-grow-1">
					<button type="button" onclick="actionFrom('addEmployee',0)"
						class="btn btn-primary">Add Employee</button>
				</div>

				<div class="p-2">
					<select class="form-select" name="search_type">
						<option value="id">Search By id</option>
						<option value="name">Search By Name</option>
						<option value="address">Search By Address</option>
						<optgroup label="Search By Salary">
							<option value=">=">Greater than</option>
							<option value="<=">Less than</option>
							<option value="=">Fixed</option>
						</optgroup>
					</select>
				</div>
				<div class="p-2">
					<input class="form-control" type="text" name="search_value">
				</div>
				<div class="p-2">
					<button type="button" class="btn btn-primary"
						onclick="actionFrom('searchEmployee',0)">Search</button>
				</div>
			</div>

			<table class="table table-success table-striped-columns">
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Salary</th>
					<th>Address</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
				<%
				List<Employee> emps = (List<Employee>) request.getAttribute("allEmployee");
				if (emps.size() == 0) {
				%>
				<td colspan='6'><h2>No Employee Found!!!</h2></td>
				<%
				}
				for (Employee emp : emps) {
				%>
				<tr>
					<td><%=emp.getId()%></td>
					<td><%=emp.getName()%></td>
					<td><%=emp.getSalary()%></td>
					<td><%=emp.getAddress()%></td>
					<td>
						<button onclick="actionFrom('showEmployee','<%=emp.getId()%>' )"
							class="btn btn-success">Edit</button>
					</td>
					<td>
						<button onclick="actionFrom('deleteEmployee','<%=emp.getId()%>' )"
							class="btn btn-warning">Delete</button>
					</td>
				</tr>
				<%
				}
				%>
			</table>
		</form>
	</div>
</body>
</html>