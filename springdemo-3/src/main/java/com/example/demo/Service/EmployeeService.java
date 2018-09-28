package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;


//interface with its declaration
public interface EmployeeService {
	
	
	void addEmp(Employee employee);
	
	List<Employee> getEmp();
	
	Optional<Employee> getEmpById(Long empid);
	
	void deleteEmp(Long id);
	
	Employee updateEmp(Employee emp,Long id);

}
