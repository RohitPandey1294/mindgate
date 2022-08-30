package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("emp name");
		String Name = scanner.nextLine();

		System.out.println("emp id");
		int EmployeeId = scanner.nextInt();

		System.out.println("emp sal");
		double salary = scanner.nextDouble();

		EmployeeServiceInterface employeeServiceInterface = new EmployeeService();

		Employee employee = new Employee(EmployeeId, Name, salary);

		boolean result = employeeServiceInterface.addNewEmployee(employee);

		
		if (result) {
			System.out.println("insert succesfull");
		} else {
			System.out.println("insert failed");
		}

	}

}
