package com.cap.avi.restapi.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cap.avi.restapi.model.Employee;


@Component
public interface IEmployeeService {
	
	
	Employee saveEmployee(Employee st);
	
	Employee getEmployeeByempID(Long empID);
	
	Long deleteEmployeeByempID(Long id);
	
	List<Employee> getAllEmployee();

}
