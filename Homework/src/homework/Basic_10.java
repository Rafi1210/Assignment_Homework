/*Write a JAVA program to input number of 
days from user and convert it to years, weeks and days.*/
package homework;

import java.util.Scanner;

public class Basic_10 {

	public static void main(String[] args) {
		int day, week, year;
		Scanner sc = new Scanner(System.in);
     	System.out.println("Enter Days : ");
     	int n = sc.nextInt();
     	year = n/365;
     	week = (n%365)/7;
     	day = (n%365)%7;
     	System.out.println(n+" days is - ");
     	System.out.println(year+" YEAR.");
    	System.out.println(week+" WEEK.");
     	System.out.println(day+" DAY.");
		
	}

}
