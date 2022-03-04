package com.bank;
import com.bank.exceptions.InvalidWithdrawException;
// defining and using our own application specific exceptions in a class

public class AccountMain {

	public static void main(String[] args) {
		Account ac = new Account(111,"Kiran",13000);
		
		try {
			ac.withdraw(6000);
			System.out.println("Withdrawal 6000 successful");
		}
		catch(InvalidWithdrawException e) {
			e.showMessage();
		}
		ac.deposit(2000);
		
		// now account balance becomes 9000
		try {
			ac.withdraw(10000);
			System.out.println("Withdrawal 10000 successful");
		} //since account balance is below 10000 so withdrawal not possible exception
		catch(InvalidWithdrawException e) {
			e.showMessage();
		}
		System.out.println(ac);
	}
}

