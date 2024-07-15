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
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<script type="text/javascript">
	function addEmployee() {
		document.frm.action = "addEmployee";
		document.frm.submit();
	}
</script>
<body>
	<div class="container">

		<form name="frm">
			<!-- <input type="hidden" name="emp_id"> 
			<div name="addemployee"> -->
				<button type="button" onclick="addEmployee()"
					class="btn btn-primary">Add Employee</button>
		<!--	</div> -->
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
				for (Employee emp : emps) {
				%>
				<tr>
					<td><%=emp.getId()%></td>
					<td><%=emp.getName()%></td>
					<td><%=emp.getSalary()%></td>
					<td><%=emp.getAddress()%></td>
					<td>
						<button class="btn btn-success">Edit</button>
					</td>
					<td>
						<button class="btn btn-warning">Delete</button>
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