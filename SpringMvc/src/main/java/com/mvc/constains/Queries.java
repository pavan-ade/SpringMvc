package com.mvc.constains;

public class Queries {
	public final static String SELECT = "select * from Employee";
	public final static String INSERT = "insert into Employee (empName,empSalary,empAddress)values(?,?,?)";
	public final static String DELETE = "delete from Employee Where empId = ?";
	public final static String UPDATE = "update Employee set empName = ?,empSalary = ?,empAddress = ? where empId = ?";
		//update employee set empName = "Abhilash", empSalary=30000,empAddres="Hyderabadi" where empId = 501;
	public final static String SELECTBYID = "select * from Employee where empId = ?";
}
