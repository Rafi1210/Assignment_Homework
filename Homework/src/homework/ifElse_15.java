
/*Write a JAVA program to input all sides of a triangle 
 and check whether triangle is valid or not.*/
package homework;

import java.util.Scanner;

public class ifElse_15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter 3 sides of the triange.");
		 System.out.print("Enter first side : ");
		 int a = sc.nextInt();
		 System.out.print("Enter second side : ");
		 int b = sc.nextInt();
		 System.out.print("Enter third side : ");
		 int c = sc.nextInt();
		 
		 if ((a+b)>c && (a+c)>b && (b+c)>a) {
			 System.out.println("The triange is valid!");
			
		} else {
	
			 System.out.println("The triange is not valid!");
		}
		
	}

}
