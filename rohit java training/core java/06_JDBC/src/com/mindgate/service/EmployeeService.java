package com.mindgate.service;

import java.util.List;

import com.mindgate.pojo.Employee;
import com.mindgate.repository.EmployeeRepository;
import com.mindgate.repository.EmployeeRepositoryInterface;

public class EmployeeService implements EmployeeServiceInterface {
	private EmployeeRepositoryInterface employeeRepositoryInterface = new EmployeeRepository();

	@Override
	public boolean addNewEmployee(Employee employee) {

		System.out.println("in service");
		return employeeRepositoryInterface.addNewEmployee(employee);

	}

	@Override
	public List<Employee> getAllEmployees() {
		System.out.println("in service");
		// TODO Auto-generated method stub
		return employeeRepositoryInterface.getAllEmployees();
	}

	@Override
	public boolean deleteEmployeebyEmployeeId(int employeeId) {
		System.out.println("in service");
		return employeeRepositoryInterface.deleteEmployeebyEmployeeId(employeeId);
	}

	@Override
	public boolean updateEmployee(String name, int employeeId) {
		System.out.println("in service");
		return employeeRepositoryInterface.updateEmployee(name, employeeId);
	}

	@Override
	public List<Employee> getOneEmployees(int employeeId) {
		System.out.println("in service");
		// TODO Auto-generated method stub
		return employeeRepositoryInterface.getOneEmployees(employeeId);
	}

}
