package com.mvc.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable{
	public Employee(String name,Double salary, String Address) {
		this.name=name;
		this.salary=salary;
		this.Address=Address;
	}
	private Integer id;
	private String name;
	private Double salary;
	private String Address;

}
