/*Write a JAVA program to input base and height of a 
triangle and find area of the given triangle.*/

package homework;

import java.util.Scanner;

public class Basic_14 {

	public static void main(String[] args) { 
		
		double height, base, area;
		Scanner sc = new Scanner(System.in);
     	System.out.print("Enter height of the triange : ");
     	height = sc.nextDouble();
     	System.out.print("Enter base of the triange : " );
     	base = sc.nextDouble();
     	System.out.println("\n");
     	area = (base*height)/2;
     	System.out.println("Area of the triangle is: "+ area +" Square Units.");
	
	}
}
