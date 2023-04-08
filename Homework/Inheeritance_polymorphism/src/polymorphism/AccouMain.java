package polymorphism;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class AccouMain {

	public static void main(String[] args) {
	
		Scanner inpScanner = new Scanner(System.in);
		Account accountID = new Account();
		Calendar accountCalendar = Calendar.getInstance();
		SavingsAccount savId = new SavingsAccount();
		
		accountID.setId(1122);
		System.out.println(accountID.getId());
		accountID.setBalance(20000);
		System.out.println(accountID.getBalance());
		accountID.setAnnualInterestRate(4.5);
		accountID.withdraw(2500);
		accountID.deposit(3000);
		System.out.println(accountID.getMonthlyInterestRate());
		
		
		System.out.println(accountCalendar.getTime());
		System.out.println("Expiry Date - ");
	  accountCalendar.add(Calendar.MONTH, 12); 
		
	  
	  savId.setCreditBalance(inpScanner.nextDouble());
	  System.out.println(savId.getCreditBalance()); 
	  
	  
	  System.out.println("Press (1) for creating a Checking Account ");
	  System.out.println("Press (2) for creating a Savings Account ");

	  ArrayList<SavingsAccount> savaccounts = new ArrayList<>();
	  int option = 0;
	  switch (option) {
	case 1: {
		
		for (int i = 0; i < savaccounts.size(); i++) {
			savaccounts.add(inpScanner.nextInt(), inpScanner.nextDouble(),inpScanner.nextDouble(), inpScanner.nextDouble());	
		}
	}
	default:

		
	  }
	  
	 
	  
	  
	  
	  
	}

}
