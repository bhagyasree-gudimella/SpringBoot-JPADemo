package com.lavanya.gudimella.SpringBootJPADemo.EmployeeController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lavanya.gudimella.SpringBootJPADemo.EmployeeService.EmployeeService;
import com.lavanya.gudimella.SpringBootJPADemo.Model.Employee;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "addEmployee", method=RequestMethod.POST)
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}
	
	@RequestMapping(value = "findEmployee/{employee_id}", method=RequestMethod.GET)
	public Optional<Employee> getEmployeeById(@PathVariable int employee_id) {
		Optional<Employee> employeeOptional = employeeService.getEmployee(employee_id);
		employeeOptional.ifPresent(employee -> {
		});
		return employeeOptional;
	}
	
	@RequestMapping(value = "findAllEmployees", method=RequestMethod.GET)
	public List<Employee> getAllEmployees() {
		return employeeService.getEmployeesList();
	}
	
	@RequestMapping(value = "updateSalary", method=RequestMethod.PUT)
	public void updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
	}
	
	@RequestMapping(value = "deleteEmployee", method=RequestMethod.DELETE)
	public void deleteEmployee(@RequestBody Employee employee) {
		employeeService.deleteEmployee(employee);
	}
	
	@RequestMapping(value = "deleteEmployeeById/{employee_id}", method=RequestMethod.DELETE)
	public void deleteEmployeeById(@PathVariable int employee_id) {
		employeeService.deleteEmployeeById(employee_id);
	}
}
