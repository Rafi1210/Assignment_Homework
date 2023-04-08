/*Write a JAVA program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.
  Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage  < 40% : Grade F  */

package homework;

import java.util.Scanner;

public class ifElse_19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks -");
		System.out.print("PHYSICS : ");
		double phy = sc.nextDouble();
		System.out.print("Chemistry : ");
		double che = sc.nextDouble();
		System.out.print("Biology : ");
		double bio = sc.nextDouble();
		System.out.print("Mathematics : ");
		double math = sc.nextDouble();
		System.out.print("Computer : ");
		double com = sc.nextDouble();
		double per = (phy+che+math+bio+com)/5;
		
		if (per >=90) {
			System.out.println("Percentage = "+ per);
			System.out.println("Garde A");
		}
		else if (per >=80) {
			System.out.println("Percentage = "+ per);
			System.out.println("Garde B");
		}
		else if (per >=70) {
			System.out.println("Percentage = "+ per);
			System.out.println("Garde C");
		}
		else if (per >=60) {
			System.out.println("Percentage = "+ per);
			System.out.println("Garde D");
		}
		else if (per >=40) {
			System.out.println("Percentage = "+ per);
			System.out.println("Garde E");
		}
		else {		
			System.out.println("Percentage = "+ per);
			System.out.println("Garde F");
			
		}
	}

}
