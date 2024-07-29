package com.mvc.constains;

public class Queries {
	public static final String SELECT = "select * from Employee";
	public static final String INSERT = "insert into Employee (empName,empSalary,empAddress)values(?,?,?)";
	public static final String DELETE = "delete from Employee Where empId = ?";
	public static final String UPDATE = "update Employee set empName = ?,empSalary = ?,empAddress = ? where empId = ?";
	public static final String SELECTBYID = "select * from Employee where empId = ?";
	public static final String SELECTBYNAME = "select * from Employee where empName like ?";
	public static final String SELECTBYADDRESS = "select * from employee where empAddress = ?";
	public static final String SELECTBYSALARYGREATERTHAN = "select * from Employee where empSalary >= ?";
	public static final String SELECTBYSALARYLESSTHAN = "select * from Employee where empSalary <= ?";
	public static final String SELECTBYSALARY = "select * from Employee where empSalary = ?";

	private Queries() {	}

}
