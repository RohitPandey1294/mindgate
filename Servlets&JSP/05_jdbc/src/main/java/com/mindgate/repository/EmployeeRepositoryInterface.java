package com.mindgate.repository;

import java.util.List;

import com.mindgate.pojo.Employee;

public interface EmployeeRepositoryInterface {
	boolean addNewEmployee(Employee employee);
	boolean updateEmployee(Employee employee);
	List<Employee> getAllEmployees();
	boolean deleteEmployeebyEmployeeId(int employeeId);
	Employee getOneEmployees(int employeeId);
}
