package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeCRUD {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");

		EmployeeServiceInterface employeeServiceInterface = applicationContext.getBean("employeeService",
				EmployeeService.class);
		employeeServiceInterface.addEmployee();

		System.out.println("Main Ends");

	}

}
