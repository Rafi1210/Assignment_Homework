package exception;

import java.util.Scanner;

public class LAB01_main {

	public static void main(String[] args) {

		
		try {
		
			Scanner myScanner = new Scanner(System.in);
			
			System.out.println("Enter Num1 and Num2 : ");
			int a =  Integer.parseInt(myScanner.nextLine());
			int b =  Integer.parseInt(myScanner.nextLine());
			
			Calculator obj1 = new Calculator(a, b);
			System.out.println("Addition is : "+ obj1.add());
			Calculator obj2 = new Calculator(a, b);
			System.out.println("Subtraction is : "+ obj2.Substract());
			Calculator obj3 = new Calculator(a, b);
			System.out.println("Multiplication is : "+ obj3.multiply());
			Calculator obj4 = new Calculator(a, b);
			System.out.println("Division is : "+ obj4.Division());
		}catch (ArithmeticException e) {
		System.out.println(e.getMessage());
		}
		catch(NumberFormatException e) {
			System.out.println(e.getMessage()+" Wrong Input , try again!");
			
		}
	}

}
