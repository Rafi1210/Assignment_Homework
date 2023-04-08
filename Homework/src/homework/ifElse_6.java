/*Write a JAVA program to check leap year using if else. */

package homework;

import java.util.Scanner;

public class ifElse_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year : ");
		int year = sc.nextInt();
		if (year%4 == 0 && year%100 != 0) {
			System.out.println("This is a LEAP YEAR!");
		} else if(year%400 == 0) {
			System.out.println("This is a LEAP YEAR!");
		}
		else {

			System.out.println("This is not a LEAP YEAR!");

		}

	}

}
