package LAB_2;

import java.util.Scanner;

public class exercise_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min,  year , day;
		System.out.println("Enter the number of minutes : ");
		 min = sc.nextInt();
		
			year = min/525600;
			day = (min %525600)/1440;
 
		System.out.println(min + " minutes is approximately "+year+" years "+"and "+ day+" days");
		
	}

}
