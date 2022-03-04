package com.bank.exceptions;
// checked exceptions are necessary to be dealt with
//unchecked exceptions may go unnoticed until the application/class is compiled and run

// DEFINING OUR OWN APPLICATION SPECIFIC EXCEPTION
public class InvalidWithdrawException extends Exception{

	String message;
	public InvalidWithdrawException(String message) {
		this.message = message;
	}
	
	public void showMessage() {
		System.out.println(message);
	}
}
