
//Which row has the largest sum

package homework_2_Array;

import java.util.Scanner;

public class TwoD5_sum_elements_arr_largest {

	public static void main(String[] args) {

		double[][] arr = new double[100][100];
		Scanner input = new Scanner(System.in);
		int index,row, col ;
		System.out.println("Enter number of index : ");
		index = input.nextInt();
		System.out.println("Enter values");
		for (row = 0; row < index; row++) {
			for (col = 0; col < index; col++) {
			System.out.print("arr["+ row +"]["+col+"] = ");
			arr[row][col] = input.nextDouble();
		}
			System.out.println("\n");
			}
		double sum = 0;
		for (row = 0; row < index; row++) {
			sum=0;
			for ( col = 0; col < index; col++) {
				
			sum = sum + arr[row][col];
		}
			System.out.println("The sum of the row no "+(row+1)+" is : "+sum);

		}

		double max =arr[0][0];
		for ( row = 0; row < index; row++) {
			for ( col = 0; col < index; col++) {
			if (sum>max) {
				 max = sum;
			}

		}
			
		}
		System.out.println("\nThe largest sum is "+max +" which is row no. "+row);
	}

}
