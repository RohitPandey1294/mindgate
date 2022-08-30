package com.mindgate.service;

import java.util.List;

import com.mindgate.pojo.Employee;

public interface EmployeeServiceInterface {
 boolean addNewEmployee(Employee employee);
 boolean updateEmployee(Employee employee);
 List<Employee> getAllEmployees();
 boolean deleteEmployeebyEmployeeId(int employeeId);
 Employee getOneEmployees(int employeeId);
}
