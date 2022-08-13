package com.mindagte.main;

import com.mindagte.pojo.Current;

public class AccountMainV5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Current current = new Current(101, "dsp", 10000, 50000);
		System.out.println("withdraw:5000");
		current.withdraw(5000);
		System.out
				.println("balance" + current.getBalance() + " " + "overdraft balance" + current.getOverdraftBalance());

		System.out.println("withdraw:15000");
		current.withdraw(15000);
		System.out
				.println("balance" + current.getBalance() + " " + "overdraft balance" + current.getOverdraftBalance());

		System.out.println("deposit:5000");
		current.deposit(5000);
		System.out
				.println("balance" + current.getBalance() + " " + "overdraft balance" + current.getOverdraftBalance());

		System.out.println("deposit:10000");
		current.deposit(10000);
		System.out
				.println("balance" + current.getBalance() + " " + "overdraft balance" + current.getOverdraftBalance());

	}

}
