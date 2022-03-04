package com.bank;
import com.bank.exceptions.InvalidWithdrawException;

public class Account {
	private int acno;
	private String name;
	private float balance;
	
	public Account(int acno, String name, float balance) {
		super();
		this.acno = acno;
		this.name = name;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Acno: "+acno+"Name: "+name+"Balance: "+balance;
	}
	
	public void deposit(float amount) {
		balance = balance + amount;
	}
	
	public void withdraw(float amount) throws InvalidWithdrawException{
		
		if(amount>balance)
			throw new InvalidWithdrawException ("Not possible to withdraw "+amount+" Balance available: "+balance);
		
		balance = balance - amount;
	}
}
