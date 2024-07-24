package com.mvc.constains;

public class Queries {
	public final static String SELECT = "select * from Employee";
	public final static String INSERT = "insert into Employee (empName,empSalary,empAddress)values(?,?,?)";
	public final static String DELETE = "delete from Employee Where empId = ?";
	public final static String UPDATE = "update Employee set empName = ?,empSalary = ?,empAddress = ? where empId = ?";
	public final static String SELECTBYID = "select * from Employee where empId = ?";
	public final static String SELECTBYNAME = "select * from Employee where empName like ?";
	public final static String SELECTBYADDRESS = "select * from employee where empAddress = ?";
	public final static String SELECTBYSALARYGREATERTHAN = "select * from Employee where empSalary >= ?";
	public final static String SELECTBYSALARYLESSTHAN = "select * from Employee where empSalary <= ?";
	public final static String SELECTBYSALARY= "select * from Employee where empSalary = ?";
										

}
