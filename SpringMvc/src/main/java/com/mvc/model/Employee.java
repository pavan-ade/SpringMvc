package com.mvc.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable{

	private Integer id;
	private String name;
	private Double salary;
	private String Address;
	
}
