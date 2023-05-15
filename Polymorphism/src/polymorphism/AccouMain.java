package polymorphism;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class AccouMain {
	public static void main(String[] args) {
		
		int id;
		double balance;
		double annualInterestRate;
		
		Scanner inpScanner = new Scanner(System.in);

		Account account1 = new Account(1122,20000,4.5);
		account1.withdraw(2500);
		account1.deposit(3000);
		account1.display();

		Calendar accountCalendar = Calendar.getInstance();
		SavingsAccount savId = new SavingsAccount();
	  
	  ArrayList<CheckingAccount> checkAccounts = new ArrayList<CheckingAccount>();
	  ArrayList<SavingsAccount> saveAccounts = new ArrayList<SavingsAccount>();
      
      
	  boolean exit = false;
		
      while (!exit){
	  System.out.println("Press (1) for creating a Checking Account ");
	  System.out.println("Press (2) for creating a Savings Account ");
	  System.out.println("Press (3) for Deposit");
	  System.out.println("Press (4) for Withdraw");
	  System.out.println("Press (5) for Exit");
	  System.out.print("Enter your option : ");

	  int opt =  inpScanner.nextInt();

	
	  switch (opt) {
	case 1: {
		for (int i = 0; i < 2; i++) {
		System.out.println("Enter Account Id: ");
        id = inpScanner.nextInt();
        System.out.println("Enter Balance: ");
        balance = inpScanner.nextDouble();
        System.out.println("Enter Annual Interest Rate: ");
        annualInterestRate = inpScanner.nextDouble();
        System.out.println("Enter Overdraft Limit: ");
        double overdraftLimit = inpScanner.nextDouble();   
		CheckingAccount acc = new CheckingAccount(id, balance, annualInterestRate, overdraftLimit);
		checkAccounts.add(acc);
		}
		
        for (int i = 0; i <checkAccounts.size(); i++) {
    		checkAccounts.get(i).display();

		}
        break;
	}
	case 2: {
		for (int i = 0; i < 2; i++) {
		System.out.println("Enter Account Id: ");
        id = inpScanner.nextInt();
        System.out.println("Enter Balance: ");
        balance = inpScanner.nextDouble();
        System.out.println("Enter Annual Interest Rate: ");
        annualInterestRate = inpScanner.nextDouble();
        SavingsAccount acc1 = new SavingsAccount(id, balance, annualInterestRate);
		saveAccounts.add(acc1);
		}
		
		for (int i = 0; i <saveAccounts.size() ; i++) {
			saveAccounts.get(i).display();
		}
		break;
	}
	  
	case 3: {
		boolean innerExit = false;
		while(!innerExit)  {
		System.out.println("Press (1) to deposit in checking account");
        System.out.println("Press (2) to deposit in Savings Account");
  	  System.out.println("Press (3) for Exit");

  	    System.out.print("Enter your option : ");

		int innerOpt = inpScanner.nextInt();
		switch (innerOpt){
		case 1: {
			
				System.out.println("Enter Account Id: ");
				int depoCheck  = inpScanner.nextInt();
				 for (int i = 0; i <checkAccounts.size(); i++) {

					 if (depoCheck==checkAccounts.get(i).getId()) {
						System.out.println("Enter Deposit amount : ");
						double depocheckAmount = inpScanner.nextDouble();
						checkAccounts.get(i).deposit(depocheckAmount);
					}
				  }
				 break;
		        }
		
		     
		case 2: {
			
			System.out.println("Enter Account Id: ");
			int deposave  = inpScanner.nextInt();
			 for (int i = 0; i <saveAccounts.size(); i++) {

				 if (deposave==saveAccounts.get(i).getId()) {
					System.out.println("Enter Deposit amount : ");
					double deposaveAmount = inpScanner.nextDouble();
					checkAccounts.get(i).deposit(deposaveAmount);
				}
			  }
		break;
		     }

		
		default: 
		        	break;
	      }
	  break;
	  }
	  break;
	}
	case 4: {
		while(true) {
		System.out.println("Press (1) to withdraw in checking account");
        System.out.println("Press (2) to withdraw in Savings Account");
    	 System.out.println("Press (3) for Exit");

    	System.out.print("Enter your option : ");

		int innerOpt = inpScanner.nextInt();
		switch (innerOpt){
		case 1: {
			
				System.out.println("Enter Account Id: ");
				int withCheck  = inpScanner.nextInt();
				 for (int i = 0; i <checkAccounts.size(); i++) {

					 if (withCheck==checkAccounts.get(i).getId()) {
						System.out.println("Enter withdraw amount : ");
						double withcheckAmount = inpScanner.nextDouble();
						checkAccounts.get(i).withdraw(withcheckAmount);
					}
				  }
				 break;
		        }
		
		     
		case 2: {
			
			System.out.println("Enter Account Id: ");
			int withsave  = inpScanner.nextInt();
			 for (int i = 0; i <saveAccounts.size(); i++) {

				 if (withsave==saveAccounts.get(i).getId()) {
					System.out.println("Enter Withdraw amount : ");
					double withsaveAmount = inpScanner.nextDouble();
					checkAccounts.get(i).withdraw(withsaveAmount);
				}
			  }
		break;
		     }

		
		default: 
		        	break;
	      }
	  break;
	  }
	  break;
	}
	case 5 : 
		System.exit(opt);
	
	  }
    
      
      }
   }
}