/*Write a JAVA program to check whether a number is
divisible by 5 and 11 or not using if else.*/

package homework;

import java.util.Scanner;

public class ifElse_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check if the number is divisible by 5 and 11 or not : ");
		double num = sc.nextDouble();
		if (num%5==0 && num%11==0) {
			System.out.println("The number is divisible by 5 and 11");
		}

		else {
			System.out.println("The number is not divisible by 5 and 11");
		}
	}

}
