package com.mindgate.main;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class HashSetWorkingMain {

	public static void main(String[] args) {
		Employee e1 = new Employee(140, "kl", 20000);
		Employee e2 = new Employee(140, "kl", 20000);

		Set<Employee> empset = new HashSet<>();

		empset.add(e1);
		System.out.println(e1);

	}

}
