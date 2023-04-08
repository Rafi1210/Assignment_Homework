package LAB_2;

import java.util.Scanner;

public class exercise_3 {

	public static void main(String[] args) {
	
		double a,b,c,r1, r2;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		double discriminant = (b*b)-(4*a*c);
		r1 = (-b + Math.pow(discriminant, 0.5)) / (2*a);
		r2 = (-b - Math.pow(discriminant, 0.5)) / (2*a);

		if (discriminant>0) {
			
			System.out.println("The equation has two roots "+r1+" and "+r2);
		}
		else if (discriminant==0) {
			System.out.println("The equation has one root "+r1);
		}
		else {
			System.out.println("The equation has no real roots!");

		}
	}

}
