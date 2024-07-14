<%@page import="java.util.List"%>
<%@page import="com.mvc.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<div>
			<button>Add Employee</button>
		</div>
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
				<button>Edit</button>
			</td>
			<td>
				<button>Delete</button>
			</td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>