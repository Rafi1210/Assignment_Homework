package polymorphism;

import java.util.Calendar;

public class SavingsAccount extends Account{
	
	Calendar expiryCalendarDate = Calendar.getInstance();
	 String cardNumber = "1012131415161718" ;
	private double currentBalance;
	private double creditBalance;

	
	SavingsAccount(){
		
	}
	
//	SavingsAccount(double currentBalance, double creditBalance){
//		this.creditBalance=creditBalance;
//		this.currentBalance=currentBalance;
//	}
	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	public double getCreditBalance() {
		return creditBalance;
	}
	public void setCreditBalance(double creditBalance) {
		this.creditBalance = getCurrentBalance()*3;
	}
	
	

	public SavingsAccount(int id, double currentBalance, double annualInterest, double MonthlyInterestAmount , String cardNumber, Calendar expiryCalendarDate, Calendar dateCreated) {
		super(id,currentBalance, annualInterest);
	}
	
	
}
