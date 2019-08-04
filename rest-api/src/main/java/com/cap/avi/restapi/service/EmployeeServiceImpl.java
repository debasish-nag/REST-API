package com.cap.avi.restapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cap.avi.restapi.model.Employee;
import com.cap.avi.restapi.repositary.EmployeeRepository;

@Component
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public Employee saveEmployee(Employee st) {
		// TODO Auto-generated method stub

		Employee emp = empRepo.save(st);
		return emp;
	}

	@Override
	public Employee getEmployeeByempID(Long empID) {
		// TODO Auto-generated method stub

		Optional<Employee> optional = empRepo.findById(empID);

		return optional.isPresent() ? optional.get() : null;
	}

	@Override
	public Long deleteEmployeeByempID(Long id) {
		// TODO Auto-generated method stub
		
		
		
		return empRepo.deleteByEmpId(id);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return  empRepo.findAll();
	}

}
