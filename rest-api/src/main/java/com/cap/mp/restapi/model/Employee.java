package com.cap.mp.restapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


@Entity
public class Employee {
	
	
	@Id
	@GeneratedValue	
	private Long id;

	@NotNull
	private String name;
	
	@NotNull
	@Min(value = 20, message = "Age should not be less than 20")
    @Max(value = 60, message = "Age should not be greater than 60")
	private Long age;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	@NotNull
	private Long salary;

}
