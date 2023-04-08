package polymorphism;

import java.util.Calendar;

public class CheckingAccount extends Account {

	final static double overdraftLimit = 100;
	public CheckingAccount(){
		
	}
	
//	private int id=0;
//	private double balance=0.0;
//	private double annualInterestRate =0.0;
//	private Calendar dateCreated;
	public CheckingAccount(int id, double balance, double annualInterest, Calendar dateCreated) {
		super(id,balance, annualInterest);
	}

	@Override
	public void withdraw(double withdrawBalance) {
		super.withdraw(withdrawBalance);
	}
	
	@Override
	public void deposit(double depositeBalance) {
		super.deposit(depositeBalance);
	}
}
