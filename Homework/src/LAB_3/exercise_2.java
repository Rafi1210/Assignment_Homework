package LAB_3;

import java.util.Scanner;



public class exercise_2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] array = new int[101];
		System.out.println("Enter the integer between 1 to 100 : ");
		int count = input.nextInt();	
			while(count != 0) {
			array[count]++;
			count = input.nextInt();		
			}
			for (int i = 0; i < array.length; i++) {
				if (array[i] != 0) {
					System.out.println((i) +" occurs " + array[i]  + (array[i]>1  ? " times": " time "));
			}
		}
	} 
}
