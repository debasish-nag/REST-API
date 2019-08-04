package com.cap.avi.restapi.repositary;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cap.avi.restapi.model.Employee;

@Repository("employeerepositary")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	@Transactional
    Long deleteByEmpId(Long empId);
    
}
