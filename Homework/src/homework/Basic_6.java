/*Write a JAVA program to enter radius of a circle
 and find its diameter, circumference and area.*/

package homework;

import java.util.Scanner;

public class Basic_6 {

	       public static void main(String[] args) {
	       Scanner myScanner = new Scanner(System.in);      
	       System.out.println("Enter the radius of the circle : ");
	       double  r = myScanner.nextDouble();
	       final double pi = 3.14159;
	       double diameter = 2*r;
	       double circumference = 2*pi*r;
	       double area = pi*r*r;
	       System.out.println("The Diameter is : "+ diameter + " units.");
	       System.out.println("The Circumference is : "+ circumference + " units.");
	       System.out.println("The Area is : "+ area + " square units.");
	        
	    }
}
