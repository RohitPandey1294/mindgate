package com.mindgate.repository;

import java.util.List;

import com.mindgate.pojo.Employee;

public interface EmployeeRepositoryInterface {
	boolean addNewEmployee(Employee employee);
	boolean updateEmployee(String name,int employeeId);
	List<Employee> getAllEmployees();
	boolean deleteEmployeebyEmployeeId(int employeeId);
	List<Employee> getOneEmployees(int employeeId);
}
