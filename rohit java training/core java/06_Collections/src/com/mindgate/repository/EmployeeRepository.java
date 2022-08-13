package com.mindgate.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.mindgate.pojo.Employee;

public class EmployeeRepository {
	List<Employee> empList = new ArrayList<Employee>();

	public List<Employee> getAllEmp() {

		return empList;

	}

	public boolean addEmployee(Employee employee) {

		boolean result = empList.add(employee);
		return result;

	}

	public Employee getEmpByEmpId(int employeeId) {
		for (Employee employee : empList) {
			if (employee.getEmployeeId() == employeeId) {
				return employee;
			}
		}
		return null;

	}

	public boolean delEmpByEmpId(int employeeId) {
		for (Employee employee : empList) {
			if (employee.getEmployeeId() == employeeId) {
				empList.remove(employee);
				return true;
			}
		}
		return false;
	}
	
		public boolean updateEmpbyEmpId(Employee e) {
			for (Employee employee : empList) {
				if (employee.getEmployeeId() == e.getEmployeeId()) {
					employee.setName(e.getName());
					employee.setSalary(e.getSalary());
					
					return true;
				}
			
			
		}return false;
		
	
}

		
}
