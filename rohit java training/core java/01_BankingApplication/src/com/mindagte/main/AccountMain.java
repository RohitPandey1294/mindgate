package com.mindagte.main;

import com.mindagte.pojo.Account;

public class AccountMain {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Account account= new Account();
		account.setAccountNumber(101);
		account.setName("rockstar");
		account.setBalance(10000);
		
	    Account account2= new Account(102, "popstar", 200000);
		
		System.out.println(account.getAccountNumber());
		System.out.println(account.getBalance());
		System.out.println(account.getName());
		
		System.out.println(account2.getAccountNumber());
		System.out.println(account2.getName());
		System.out.println(account2.getBalance());
		
		System.out.println(account2);
		
	
	}
}


