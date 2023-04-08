package polymorphism;

import java.util.Calendar;

public class Account {

	private int id=0;
	private double balance=0.0;
	private double annualInterestRate =0.0;
	private Calendar dateCreated;
	
	public Account() {	
	}
	public Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance=balance;
		this.annualInterestRate=annualInterestRate;
		this.dateCreated = Calendar.getInstance();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		
		this.annualInterestRate = (annualInterestRate*getBalance())/100;
	}
	public Calendar getDateCreated() {
		return dateCreated;
	}
	public double getMonthlyInterestRate() {
	return (getAnnualInterestRate()/12)/100;
	}
	public double getMonthlyInterestAmount(){
		return (getBalance()*getMonthlyInterestRate());	
	}
	public void withdraw(double withdrawBalance) {
		while (balance!=0) {
			withdrawBalance-= balance;
			setBalance(withdrawBalance);
		}
	}
	public void deposit(double depositeBalance) {
	depositeBalance+= balance;	
	setBalance(depositeBalance);
	}
	
}
