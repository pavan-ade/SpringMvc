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
	function actionFrom(formName, id) {
		if (id === 0) {
			document.frm.action = formName;
		} else {
			if (formName == 'deleteEmployee') {
				if (confirm("Do you Want to delete it ?")) {
					document.frm.emp_id.value = id;
					document.frm.action = formName;

				} else {
					document.frm.action = 'getshowAllEmployee';
				}
				
			} else if (formName == 'showEmployee') {
				document.frm.emp_id.value = id;
				document.frm.action = formName;
			}
		}
		document.frm.submit();

	}
</script>
<body>
	<div class="container">

		<form name="frm" method="post">
			<input type="hidden" name="emp_id">

			<button type="button" onclick="actionFrom('addEmployee',0)"
				class="btn btn-primary">Add Employee</button>

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