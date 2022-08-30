package com.mindgate.main;

import java.util.List;
import java.util.Scanner;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeCRUDMain {

	public static void main(String[] args) {
		EmployeeServiceInterface employeeServiceInterface = new EmployeeService();
		Scanner scanner = new Scanner(System.in);

		String continuechoice;
		String Name;
		int EmployeeId ;
		double salary;
		int choice;
		boolean result;
		List<Employee> allemployee;
		List<Employee> oneemployee;

		do {

			System.out.println("Enter your choice");
			System.out.println("choose 1 for adding data in employee");
			System.out.println("choose 2 for updating data in employee");
			System.out.println("choose 3 for deleting data from employee");
			System.out.println("choose 4 for getting one data from employee");
			System.out.println("choose 5 for getting all data from employee");

			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1: {

				System.out.println("emp name");
				Name = scanner.nextLine();

				System.out.println("emp id");
				EmployeeId = scanner.nextInt();

				System.out.println("emp sal");
				salary = scanner.nextDouble();

				Employee employee = new Employee(EmployeeId, Name, salary);

				result = employeeServiceInterface.addNewEmployee(employee);

				if (result) {
					System.out.println("insert succesfull");
				} else {
					System.out.println("insert failed");
				}
				break;

			}
			case 5: {
				allemployee = employeeServiceInterface.getAllEmployees();
				for (Employee e : allemployee) {
					System.out.println(e);

				}
				break;
			}
			case 3: {

				System.out.println("emp id");
				EmployeeId = scanner.nextInt();

				result = employeeServiceInterface.deleteEmployeebyEmployeeId(EmployeeId);

				if (result) {
					System.out.println("delete succesfull");
				} else {
					System.out.println("delete failed");
				}
				break;

			}
			case 2: {
				System.out.println("set name to");
				Name = scanner.nextLine();
				scanner.nextLine();

				System.out.println("emp id");
				EmployeeId = scanner.nextInt();
				scanner.nextLine();

				result = employeeServiceInterface.updateEmployee(Name, EmployeeId);

				if (result) {
					System.out.println("update succesfull");
				} else {
					System.out.println("update failed");
				}
				break;

			}
			case 4: {
				System.out.println("emp id");
				EmployeeId = scanner.nextInt();
				oneemployee = employeeServiceInterface.getOneEmployees(EmployeeId);
			
				
				for (Employee e : oneemployee) {
					System.out.println(e);

				}
				break;
			}

			default:
				System.out.println("enter a valid choice");
				break;
			}

			System.out.println("do you want to continue");
			continuechoice = scanner.nextLine();
		}

		while (continuechoice.equalsIgnoreCase("yes"));
	}

}
