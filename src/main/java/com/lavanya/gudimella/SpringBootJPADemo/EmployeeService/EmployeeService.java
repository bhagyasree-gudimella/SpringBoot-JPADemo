package com.lavanya.gudimella.SpringBootJPADemo.EmployeeService;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.lavanya.gudimella.SpringBootJPADemo.Model.Employee;

@Service
public interface EmployeeService {
	
	public Employee addEmployee(Employee employee);
	
	public Optional<Employee> getEmployee(int employee_id);
	
	public List<Employee> getEmployeesList();
	
	public void updateEmployee(Employee employee);
	
	public void deleteEmployee(Employee employee);
	
	public void deleteEmployeeById(int employee_id);
}
