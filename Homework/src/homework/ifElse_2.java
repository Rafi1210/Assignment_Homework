/*Write a JAVA program to find maximum between three numbers 
using ladder if else or nested if.*/

package homework;

import java.util.Scanner;

public class ifElse_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers : ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		if (a>b && a>c) {
			System.out.println(a+" is the maximum number.");
		}
		else if (b>c && b>a) {
			System.out.println(b+" is the maximum number.");
		}
		else {
			System.out.println(c+ " is the maximum number.");
		}

	}

}
