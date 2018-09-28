package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.entity.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
//making the beans repository	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void addEmp(Employee emp) {
		employeeRepository.save(emp);
	}

	@Override
	public List<Employee> getEmp() {
		// TODO Auto-generated method stub
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> getEmpById(Long empid) {
		
		return employeeRepository.findById(empid);
	}

	@Override
	public void deleteEmp(Long id) {
		employeeRepository.deleteById(id);
		
	}

	@Override
	public Employee updateEmp(Employee emp,Long id) {
		return employeeRepository.save(emp);
		
	}





	
	

	

}
