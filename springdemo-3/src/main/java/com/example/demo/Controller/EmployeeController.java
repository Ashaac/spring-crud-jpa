package com.example.demo.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
	
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EmployeeService;
import com.example.demo.Service.EmployeeServiceImpl;
import com.example.demo.entity.Employee;

	@RestController
	@RequestMapping("/employee")
	public class EmployeeController {

		@Autowired
		private EmployeeService employeeService;
	//getting the employee
		@RequestMapping("")
		public List<Employee> getEmp() {
			return employeeService.getEmp();
		}
			
	//get employee by id	
		@GetMapping("/{id}")
		
		public Optional<Employee> getEmpById(@PathVariable Long empid){
			return employeeService.getEmpById(empid);
		}
		
		//to insert the employee
		@RequestMapping(method=RequestMethod.POST)
		public ResponseEntity<?> saveEmp(@RequestBody Employee emp){
			employeeService.addEmp(emp);
			return ResponseEntity.ok("inserted");
		}

		//update employee
		@RequestMapping(value= "/{id}",method=RequestMethod.PUT)
		public void modifyEmp(@RequestBody Employee emp,@PathVariable Long id ) {
			employeeService.updateEmp(emp,id);
		} 	
	
		//delete employee
		@RequestMapping(value= "/{id}",method=RequestMethod.DELETE)
		public void removeCourse(@PathVariable Long id) {
			employeeService.deleteEmp(id);
		}
		

}
	
	
	