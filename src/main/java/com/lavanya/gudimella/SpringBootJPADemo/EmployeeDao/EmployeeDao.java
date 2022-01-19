package com.lavanya.gudimella.SpringBootJPADemo.EmployeeDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lavanya.gudimella.SpringBootJPADemo.Model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
