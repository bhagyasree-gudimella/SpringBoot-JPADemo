package com.lavanya.gudimella.SpringBootJPADemo.EmployeeService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lavanya.gudimella.SpringBootJPADemo.EmployeeDao.EmployeeDao;
import com.lavanya.gudimella.SpringBootJPADemo.Model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee addEmployee(Employee employee) {
		Employee savedEmployee = employeeDao.save(employee);
		return savedEmployee;
	}

	@Override
	public Optional<Employee> getEmployee(int employee_id) {
		return employeeDao.findById(employee_id);
	}

	@Override
	public List<Employee> getEmployeesList() {
		return employeeDao.findAll();
	}

	@Override
	public void updateEmployee(Employee employee) {
		Employee uEmployee = employeeDao.getOne(employee.getEmployee_id());
		uEmployee.setSalary(employee.getSalary());
		employeeDao.save(uEmployee);
	}

	@Override
	public void deleteEmployee(Employee employee) {
		employeeDao.delete(employee);
	}

	@Override
	public void deleteEmployeeById(int employee_id) {
		employeeDao.deleteById(employee_id);
	}

}
