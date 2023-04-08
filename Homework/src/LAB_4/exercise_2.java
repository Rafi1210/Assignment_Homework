package LAB_4;

import java.util.Scanner;

public class exercise_2 {
	
	public static final int passLength = 8;
	
	public static boolean valid_password(String x)
	{
		if (x.length() < passLength) {
			return false;
		}
		
		int lettercount = 0;
		int digitcount = 0;
		
		for(int i = 0; i < x.length();i++) {
			char c = x.charAt(i);
			if (isLetter(c)) {
				lettercount++;
			}
			else if (isDigit(c)) {
				digitcount++;
			}
			else return false;
		}	
		return (lettercount >= 2 && digitcount >= 2);
	}
	
	
	public static boolean isLetter(char c) {
		c = Character.toUpperCase(c);
		boolean letterRange = (c >= 'A' && c <= 'Z');
		return letterRange;	
	}
	
	
	public static boolean isDigit(char d) {
		boolean digitRange = (d >= '0' && d <= '9');
		return digitRange;
	}
	
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Following rules must be followed - ");
		System.out.println("1. A password must have at least eight characters. \n2."
				+ " A password consists of only letters and digits."
				+ "\n3. A password must contain at least two digits");
		System.out.print("Enter password to check if the password is valid or not : ");
		String pass = input.next();
		
		if (valid_password(pass)) {
			System.out.println("Password is valid!");
		} else {
			System.out.println("Password is invalid!");
		}	
	}
}
