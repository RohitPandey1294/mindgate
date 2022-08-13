package com.mindagte.pojo;

public class Current extends Account {
	private double overdraftBalance;
	private double intialoverdraftBalance;

	public Current() {
		// TODO Auto-generated constructor stub
	}

	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		this.intialoverdraftBalance = overdraftBalance;
	}

	@Override
	public boolean withdraw(double amount) {
//		if (getBalance() >= 0) {
//			setBalance(getBalance() - amount);
//			if (getBalance() <= 0) {
//
//				setOverdraftBalance(getOverdraftBalance() + getBalance());
//				setBalance(getBalance()-getBalance());
//			}
//		} else {
//
//			setOverdraftBalance(getOverdraftBalance() - amount);
//		}
		if (amount > 0 && amount <= getBalance()) {
			setBalance(getBalance() - amount);
			return true;
		}
		if (amount > 0 && amount > getBalance() && amount < getBalance() + getOverdraftBalance()) {
			amount = amount - getBalance();
			setBalance(0);
			overdraftBalance = overdraftBalance - amount;
			return true;
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
//		if (getOverdraftBalance() >= variable) {
//			setBalance(getBalance() + amount);
//
//		} else {
//			setOverdraftBalance(getOverdraftBalance() + amount);
//			if (getOverdraftBalance()>=variable) {
//              double excess= 0;
//              excess= getOverdraftBalance()-variable;
//              setBalance(getBalance()+excess);
//              variable=variable+excess;
//			}
//		}
		if (amount > 0) {
			if (overdraftBalance < intialoverdraftBalance) {
				double differrence = intialoverdraftBalance - overdraftBalance;
				if (differrence < amount) {
					amount = amount - differrence;
					overdraftBalance = intialoverdraftBalance;
					setBalance(getBalance() + amount);
					return true;
				} else {
					overdraftBalance = overdraftBalance + amount;
					return true;
				}

			} else {
				setBalance(getBalance() + amount);
				return true;
			}

		}

		return false;
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

}
