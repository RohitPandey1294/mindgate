package com.mindgate.main;

import java.util.ArrayList;
import java.util.List;

import com.mindgate.pojo.Employee;
import com.mindgate.repository.EmployeeRepository;

public class EmployeeRepositoryMain {

	public static void main(String[] args) {
		EmployeeRepository empr = new EmployeeRepository();

		Employee employee1 = new Employee(140, "kl", 20000);
		Employee employee2 = new Employee(150, "kl", 20000);
		Employee employee3 = new Employee(160, "2l", 20000);
		
		empr.addEmployee(employee1);
		empr.addEmployee(employee2);
		empr.addEmployee(employee3);

		List<Employee> emp = empr.getAllEmp();

		for (Employee e : emp) {
			System.out.println(e);

		}

		Employee EmployeeId = empr.getEmpByEmpId(140);
		System.out.println(EmployeeId);

		System.out.println("before Delete");
		for (Employee e : emp) {

			System.out.println(e);

		}

		boolean result = empr.delEmpByEmpId(140);

		System.out.println("After Delete");
		emp = empr.getAllEmp();
		for (Employee e : emp) {
			System.out.println(e);

		}
		boolean result2 = empr.updateEmpbyEmpId(new Employee(150, "rps", 1234));

		System.out.println("After update");
		emp = empr.getAllEmp();
		for (Employee e : emp) 
		{
			System.out.println(e);
		}

	}
}
