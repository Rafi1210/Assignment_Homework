/*
Write a JAVA program to input electricity unit charges and calculate total 
electricity bill according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional sur_charge of 20% is added to the bill
*/

package homework;

import java.util.Scanner;

public class ifElse_21 {

	public static void main(String[] args) {

		int unit = 0;
	    double amt, total_amt, sur_charge;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter total units consumed: ");
	    unit = sc.nextInt();
	    if(unit <= 50)
	    {
	        amt = unit * 0.50;
	    }
	    else if(unit <= 150)
	    {
	        amt = 25 + ((unit-50) * 0.75);
	    }
	    else if(unit <= 250)
	    {
	        amt = 100 + ((unit-150) * 1.20);
	    }
	    else
	    {
	        amt = 220 + ((unit-250) * 1.50);
	    }
		
		sur_charge = amt * 0.20;
	    total_amt  = amt + sur_charge;

	    System.out.println("Electricity Bill = Rs. "+ total_amt);

	}

}
