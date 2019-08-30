package com.cap.mp.restapi.controler;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.cap.mp.restapi.exception.NoSuchResourceFoundException;
import com.cap.mp.restapi.model.Employee;
import com.cap.mp.restapi.service.IEmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	IEmployeeService service;

	@RequestMapping(value = "/employee/create", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<Employee> createEmployee(@RequestBody @Valid Employee employee) {

		ResponseEntity<Employee> rsp = null;

		Employee emp = service.saveEmployee(employee);

		rsp = new ResponseEntity<Employee>(emp, HttpStatus.OK);

		return rsp;
	}

	@RequestMapping(value = "/employee/{empId}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public Employee getEmployeeByempId(@PathVariable Long empId) {

		Employee emp = service.getEmployeeByempID(empId);

		if (emp == null) {

			throw new NoSuchResourceFoundException("Resoursce not found");
		}

		return emp;
	}

	@RequestMapping(value = "/employee/delete/{empId}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void deleteEmployeeByEmpid(@PathVariable Long empId) {

		Long st = service.deleteEmployeeByempID(empId);

		if (st == 0) {

			throw new NoSuchResourceFoundException("Resoursce not found to delete");
		}
	}

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public ArrayList<Employee> getAllEmployes() {

		List<Employee> lisEmp = service.getAllEmployee();

		if (lisEmp == null) {

			throw new NoSuchResourceFoundException("Employee list is empty");
		}

		return (ArrayList<Employee>) lisEmp;
	}
	
	
	@RequestMapping(value = "/employee/update", method = RequestMethod.PUT, consumes = "application/json")
	public ResponseEntity<Employee> updateEmployee(@RequestBody @Valid Employee employee) {

		ResponseEntity<Employee> rsp = null;

		Employee emp = service.saveEmployee(employee);

		rsp = new ResponseEntity<Employee>(emp, HttpStatus.OK);

		return rsp;
	}

}
