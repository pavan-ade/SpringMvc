package com.mvc.model;

import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable{
	@NotBlank
	private Integer id;
	
	@NotBlank(message = "name must and shold be fill!!!")
	@Size(max = 45, message = "Plase maintain character size between 0 to 45")
	private String name;
	
	@Positive(message = "please enter positive Values only!!!")
	private Double salary;

	@NotBlank(message = "name must and shold be fill!!!")
	@Size(max = 45, message = "Plase maintain character size between 0 to 45")
	private String Address;
	public Employee(String name,Double salary, String Address) {
		this.name=name;
		this.salary=salary;
		this.Address=Address;
	}

}
