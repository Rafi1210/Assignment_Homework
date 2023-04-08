package LAB_2;

import java.util.Scanner;

public class exercise_4 {

	public static void main(String[] args) {

		double bdt , usd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 0 to convert from USD to BDT");
		System.out.println("Enter 1 to convert from BDT to USD");
		System.out.print("Choose your option : ");
		int type  = sc.nextInt();
		if (type==0) {
			System.out.print("Enter amount in USD : ");
			usd = sc.nextDouble();
			bdt = usd*104.99;
			System.out.println(usd+" USD = "+bdt+" Taka");
		}
		else if (type==1) {
			System.out.print("Enter amount in BDT : ");
			bdt = sc.nextDouble();
			usd = bdt*0.0095;
			System.out.println(bdt+" BDT = "+usd+" US Dollar");
		}
		else {
			System.out.println("You must have to enter between 0 and 1 to convert the amount of money!");
		}
	}

}
