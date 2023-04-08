package objectclass;

import java.util.Scanner;

class Fraction {
	
	private int numerator;
	private int denominator;

	Fraction(){	
	}
	public Fraction(int numerator, int denominator){
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public void setdenominator(int denominator) {
		this.denominator = denominator;
	}
	public int getdenominator() {
		return denominator;
	}
	public void setnumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getnumerator() {
		return numerator;
	}
	
	public String toString() {
		return numerator +"/"+denominator; 
	}
	
	public void add(Fraction fraction) {
		int nume = this.numerator * fraction.denominator + this.denominator * fraction.numerator; 
		int deno = this.denominator * fraction.denominator;
		numerator = nume;
	    denominator = deno;
	}
	
	public void sub(Fraction fraction) {
		int nume = (this.numerator * fraction.denominator) - (this.denominator * fraction.numerator); 
		int deno = this.denominator * fraction.denominator;
		numerator = nume;
		denominator = deno;
	}
	
	public void multiplication(Fraction fraction) {
    int nume = this.numerator * fraction.numerator;
    int deno = this.denominator * fraction.denominator;
	numerator = nume;
	denominator =  deno;
	}
	
	public void division(Fraction fraction) {
		int nume  = this.numerator * fraction.denominator;
	    int deno = this.denominator * fraction.numerator;
		numerator = nume;
		denominator =  deno;
	}
}



public class fractionmain {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		Fraction obj1 = new Fraction();
		Fraction obj2 = new Fraction();
		
		System.out.println("Enter first fraction : ");
		System.out.println("Enter Numerator : ");	
		obj1.setnumerator(input.nextInt());
		System.out.println("Enter Denominator : ");	
		obj1.setdenominator(input.nextInt());
		
		System.out.println("Enter second fraction : ");
		System.out.println("Enter Numerator : ");
		obj2.setnumerator(input.nextInt());
		System.out.println("Enter Denominator : ");	
		obj2.setdenominator(input.nextInt());
		
		System.out.println("\nThe First Fraction Is : " + obj1.toString());

		System.out.println("The Second Fraction Is : " +	obj2.toString());
		System.out.println("\n");
		
		obj1.add(obj2);
		System.out.print("Addition is : ");
		System.out.println(obj1);
		
		obj1.sub(obj2);
		System.out.print("Substraction is : ");
		System.out.println(obj1);
		
		obj1.multiplication(obj2);
		System.out.print("Multiplication is : ");
		System.out.println(obj1);
		
		obj1.division(obj2);
		System.out.print("Division is : ");
		System.out.println(obj1);
	}

}
