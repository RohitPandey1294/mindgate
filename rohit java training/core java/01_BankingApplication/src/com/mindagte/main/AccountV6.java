package com.mindagte.main;

import com.mindagte.pojo.Account;
import com.mindagte.pojo.Savings;

public class AccountV6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account;
		account = new Savings(101, "ajaiya", 45000, false);
		System.out.println(account.withdraw(2450));
	}

}
