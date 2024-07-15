package com.mvc.constains;

public class Queries {
	public final static String SELECT = "select * from Employee";
	public final static String INSERT = "insert into Employee (empName,empSalary,empAddress)values(?,?,?)";
	public final static String DELETE = "delete from Employee Where empId = ?";
}
