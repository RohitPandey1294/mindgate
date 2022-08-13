package com.mindgate.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import com.mindgate.pojo.Employee;

public class CollectionsMain {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		System.out.println(nameList.size());
		nameList.add("aj");
		nameList.add("bj");
		nameList.add("cj");
		nameList.add("dj");
		System.out.println(nameList);
		System.out.println(nameList.size());
		nameList.remove(2);
		System.out.println("after remove");
		System.out.println(nameList);
		System.out.println(nameList.size());

		System.out.println();
		List<Employee> employeeList = new ArrayList<>();
		Employee e1 = new Employee(101, "aj", 2000);
		Employee e2 = new Employee(102, "bj", 2000);
		Employee e3 = new Employee(103, "cj", 2000);

		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);

		System.out.println("after obj addtions");
		System.out.println();
		System.out.println("without itreations");
		System.out.println(employeeList);
		System.out.println();
		System.out.println("with itreations");
		for (Employee e : employeeList) {
			System.out.println(e);
		}
		System.out.println();
		Set<String> nameSet= new HashSet<>();
		nameSet.add("rp");
		nameSet.add("1p");
		nameSet.add("2p");
		nameSet.add("gp");
		nameSet.add(null);
		System.out.println(nameSet);
		
		System.out.println();
		SortedSet<String> sortednameSet= new TreeSet<>();
		sortednameSet.add("rhp");
		sortednameSet.add("1hp");
		sortednameSet.add("2hp");
		sortednameSet.add("ghp");
		
		System.out.println(sortednameSet);
		
		System.out.println();
		HashMap<Integer, String> employeeMap = new HashMap<>();
		employeeMap.put(1, "bn");
		employeeMap.put(2, "nn");
		employeeMap.put(3, "mn");
		
		System.out.println(employeeMap);
		
		System.out.println();
		Integer i = 50;
		System.out.println(i.hashCode());
		
		System.out.println();
		SortedMap<String, String> employeesortedMap = new TreeMap<>();
		 
		employeesortedMap.put("k", "bn");
		employeesortedMap.put("h", "nn");
		employeesortedMap.put("n", "mn");
		
		System.out.println(employeesortedMap);
		}

}
