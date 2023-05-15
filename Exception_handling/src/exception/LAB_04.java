package exception;

import java.util.Scanner;

public class LAB_04 {

	public static void main(String[] args) {
try {
	

		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter the three sides of the triange : ");
		double side1 = myScanner.nextDouble();
		double side2 = myScanner.nextDouble();
		double side3 = myScanner.nextDouble();
		myScanner.nextLine();
	System.out.println("Enter color of the triange : ");
	String colorString = myScanner.nextLine();
	
	System.out.print("Is the triangle filled (true or false)? ");
    boolean filled = myScanner.nextBoolean();

    
	Triangle objTriangle = new Triangle(side1, side2, side3);
	objTriangle.setColor(colorString);
	objTriangle.setFilled(filled);
	
	System.out.println(objTriangle.toString());
	System.out.println("Area of the triange is : "+ objTriangle.getArea());
	System.out.println("Perimeter of the triange is : "+objTriangle.getPerimeter());
	System.out.println("Color of the triange is : "+ objTriangle.getColor());
	System.out.println("Triange is filled : "+ objTriangle.getFilled());
}
	 catch (IllegalTriangleException e) {

	 System.out.println(e.getMessage());
	 }
	}

}
