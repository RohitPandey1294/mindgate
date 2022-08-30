package com.mindagte.main;


import com.mindagte.pojo.Account;

public class Accountmainv2 {
	public static void main(String[] args) {
		Account account=new Account(130, "RICKSHAWALA", 12345);
			System.out.println("this is mainaccv2");
			System.out.println(account);
			System.out.println("withdraw:: 2450");
			boolean result=account.withdraw(2450);
			if(result)
				System.out.println("transaction success");
			else
				System.out.println("insufficient balance");
			
			System.out.println("Balance ::" + account.getBalance());
			
			
	}

}
