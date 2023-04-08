package LAB_3;

import java.util.Scanner;

public class exercise_3 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
	

		System.out.println("Enter any string or number to check if it is a Palindrome or not!");
		String reverse = "" ;
		String original = myScanner.nextLine();
		
		int length = original.length();
	
		for(int i = length - 1;i >= 0 ;i-- ) 
			
		reverse += original.charAt(i); 
			if(original.equals(reverse)) 
				
				System.out.println(original+" is a Palindrome ");
			
			else 
				System.out.println(original+ " is not a Palindrome");
				
		
	}

}
