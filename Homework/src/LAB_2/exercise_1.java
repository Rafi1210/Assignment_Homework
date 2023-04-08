package LAB_2;

import java.util.Scanner;

public class exercise_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int x = sc.nextInt();
	
	 if (x%2==0 && x%3==0) {
		System.out.println("False");
	}
	 else if(x%2==0 || x%3==0) {
			System.out.println("True");
	  
	 }
	else {
		System.out.println("False");
	}

	}

}
