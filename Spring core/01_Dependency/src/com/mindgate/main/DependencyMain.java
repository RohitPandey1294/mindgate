package com.mindgate.main;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class DependencyMain {

	public static void main(String[] args) {
		System.out.println("Main start");

//		System.out.println("creating the address object and calling set method");
//
//		Address address = new Address();
//		address.setAddressId(11);
//		address.setBuildingName("ramadhir waseeepur");
//		address.setCity("waseeypur");
//		address.setHouseNumber("123");
//		address.setPin("40086");
//		address.setStreet("bjp");
//
//		System.out.println("creating the Employee object and calling set method");
//		
//		Employee employee = new Employee();
//		employee.setEmployeeId(101);
//		employee.setName("sardar khan");
//		employee.setSalary(2500);
//		employee.setHomeAddress(address);
//		
//		System.out.println(employee);
Address address=new Address(121, "123"	, "safe", "unsafe", "lobly", "400086");
		Employee employee = new Employee(101, "rama", 52200, address);

		System.out.println(employee);
		
		
		System.out.println("Main ends");
	}

}
