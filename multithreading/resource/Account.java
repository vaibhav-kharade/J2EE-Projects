package com.jspiders.multithreading.resource;

public class Account {
	int accountBalance;

	public Account(int accountBalance) {
		super();
		this.accountBalance=accountBalance;
		
		// TODO Auto-generated constructor stub
	}
	public void checkBalance() {
		System.out.println("current Balance : "+accountBalance);
	}
	public synchronized void depositAmount(int amount) {
		System.out.println("Deposited amount : "+amount);
		accountBalance+=amount;
		
		
	}
	public synchronized void withdrawAmount(int amount) {
		System.out.println("withdrawl amount : "+amount);
		if (amount>accountBalance) {

			System.out.println("insufficient Balance");
		} else {
			accountBalance-=amount;
			checkBalance();
		}
	}
	
}
