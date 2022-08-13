package com.mindagte.main;

import java.util.Scanner;

import com.mindagte.pojo.Account;

public class AccountNameV3 {
	public static void main(String[] args) {
		String name;
		double balance;
		int accountno;
		int menu;
		double amount;
		String choice;
		

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		name = sc.nextLine();

		System.out.println("enter the balance");
		balance = sc.nextDouble();

		System.out.println("enter the account no.");
		accountno = sc.nextInt();

		Account account = new Account(accountno, name, balance);

		System.out.println(account.getAccountNumber());
		System.out.println(account.getName());
		System.out.println(account.getBalance());

		System.out.println(account);
		System.out.println("------------------------------");

		
		
		do {
		System.out.println("press 1 for withdraw");
		System.out.println("press 2 for deposit");
		System.out.println("press 3 for balance check");
		menu = sc.nextInt();
		

		switch (menu) {
		case 1:
			System.out.println("enter the amount to be withdrawn");
			amount =sc.nextInt();
			boolean result = account.withdraw(amount);
			if (result)
				System.out.println("transaction success");
			else
				System.out.println("insufficient balance");

			System.out.println("Balance ::" + account.getBalance());

			break;

		case 2:
			System.out.println("enter the deposit amount");
			amount =sc.nextInt();
			result = account.deposit(amount);
			if (result)
			System.out.println("transaction success");
			else
				System.out.println("insufficient balance");
			System.out.println("Balance ::" + account.getBalance());
			break;

		case 3:
			System.out.println("Balance ::" + account.getBalance());

		default:
			System.out.println("invalid choice");
			break;
		}
		System.out.println("do you want to continue?");
		choice=sc.next();
		}
		while(choice.equals("yes"));
		
			

		
	}

}
