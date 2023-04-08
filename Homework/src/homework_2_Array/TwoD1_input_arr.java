
//initializing with arrays

package homework_2_Array;

import java.util.Scanner;

public class TwoD1_input_arr {

	public static void main(String[] args) {

		double[][] arr = new double[100][100];
		Scanner input = new Scanner(System.in);
		int index ;
		System.out.println("Enter number of row index : ");
		index = input.nextInt();
	 
		System.out.println("Enter values");
 
		for (int row = 0; row < index; row++) {
			
			for (int col = 0; col < index; col++) {
				System.out.print("arr["+ row +"]["+col+"] = ");
				arr[row][col] = input.nextInt();
			}
			System.out.println("\n");
		}
			
	}

}
