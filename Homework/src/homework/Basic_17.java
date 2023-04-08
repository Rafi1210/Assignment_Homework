/*Write a JAVA program to input
principle, time and rate (P, T, R) from user and find Simple Interest*/

package homework;

import java.util.Scanner;

public class Basic_17 {

	public static void main(String[] args) {
		
		double rate, principal,time, interest;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal value : ");
		principal = sc.nextDouble();
		System.out.println("Enter Interest Rate : ");
		rate = sc.nextDouble();
		System.out.println("Enter Time in year : ");
		time = sc.nextDouble();
		
		interest = rate* principal* time* 0.01;
		System.out.println("Your yearly Interest is : "+ interest);

	}

}
