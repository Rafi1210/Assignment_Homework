package polymorphism;

import java.util.Calendar;

public class CheckingAccount extends Account{
	private double overdraftLimit;
	public CheckingAccount(){	
	}
	
//	private int id=0;
//	private double balance=0.0;
//	private double annualInterestRate =0.0;
//	private Calendar dateCreated;
   CheckingAccount(int id, double balance, double annualInterest, double overdraftLimit) {
		
		super(id,balance, annualInterest);	
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void withdraw(double withdrawBalance) {
	if (withdrawBalance>=overdraftLimit) {
		 setBalance(getBalance() - withdrawBalance);
		 System.out.println("Withdraw successful ! Total amount is : "+getBalance());
	}
	else {
		System.out.println("You can not withdraw ");
	}
}
	
	@Override
	public void deposit(double depositeBalance) {
		
			setBalance(getBalance()+depositeBalance);
		
			System.out.println("Deposit successful ! Total amount is : "+getBalance());
		
		}
	
	public void display()
    {
        super.display();
        
        System.out.println("Monthly Interest: " + getMonthlyInterestAmount() + "\nOverDraft Limit : "+overdraftLimit);
    }
}
