package polymorphism;

import java.util.Calendar;

public class SavingsAccount extends Account{
	
    String cardNumber = "1012131415161718";
	

	Calendar expiryDate = Calendar.getInstance();
	SavingsAccount(){	
	}
	

 SavingsAccount(int id, double balance, double annualInterest) {
		super(id,balance,annualInterest);
	}

	public double getCreditBalance() {
		return getBalance()*3;
	}

@Override
public void withdraw(double withdrawBalance) {
if (withdrawBalance>0 && getBalance()>=withdrawBalance) {
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
   
   System.out.println("Credit Card Number : " + cardNumber + "\n"
   + "Card Expiry Date : " +(expiryDate.get(Calendar.YEAR)+5)
   + "\nCredit Balance : " + getCreditBalance()
   );
}

}
