package polymorphism;

import java.util.Calendar;
import java.util.Date;

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
	public Date getDateCreated() {
		return dateCreated.getTime();
	}
	public double getMonthlyInterestRate() {
	return (annualInterestRate/12)/100;
	}
	public double getMonthlyInterestAmount(){
		return (balance*getMonthlyInterestRate());	
	}
	public void withdraw(double withdrawBalance) {
		if (balance!=0) {
		balance -=withdrawBalance;
		System.out.println("Withdraw successful! Withdraw balance is : "+ withdrawBalance);
		}
		else {
			System.out.println("Balance must be greater than 0!");
		}
	}
	public void deposit(double depositeBalance) {
		balance += depositeBalance;	
		System.out.println("Deposit successful! deposit balance is : "+ depositeBalance);
	
	}
	public void display()
    {
       System.out.println("Account ID : "+id+"\n Current Balance : "+balance+"\n Annual Ineterest Rate: "+annualInterestRate+ "\n Monthly Interest Rate: "+getMonthlyInterestRate()+"\n Date Created : "+ dateCreated.getTime());
    }
	
}
