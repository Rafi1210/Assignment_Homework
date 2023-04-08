
//Summing all elements by column

package homework_2_Array;

import java.util.Scanner;

public class TwoD4_sum_elements_arr_col {

	public static void main(String[] args) {
		double[][] arr = new double[100][100];
		Scanner input = new Scanner(System.in);
		int index ;
		System.out.println("Enter number of index : ");
		index = input.nextInt();
		System.out.println("Enter values");
		for (int row = 0; row < index; row++) {
			for (int col = 0; col < index; col++) {
			System.out.print("arr["+ row +"]["+col+"] = ");
			arr[row][col] = input.nextDouble();
		}
			}
		double sum = 0;
		for (int row = 0; row < index; row++) {
			sum=0;
			for (int col = 0; col < index; col++) {
				
			sum = sum + arr[col][row];
		}
			System.out.println("The sum of the col no "+(row+1)+" is : "+sum);

		}

	}

}
