
//Finding the smallest index of the largest element

package homework_2_Array;

import java.util.Scanner;

public class TwoD6_small_index_arr {

	public static void main(String[] args) {


		double[][] arr = new double[100][100];
		Scanner input = new Scanner(System.in);
		int index ,row,col, temp=0 , temp1=0;
		System.out.println("Enter number of index : ");
		index = input.nextInt();
	 
		System.out.println("Enter values");
 
		for ( row = 0; row < index; row++) {
			for(col=0;col<index;col++) {
			System.out.print("arr["+ row +"]["+col+"] = ");
			arr[row][col] = input.nextDouble();
		}
		}
		
		double max = arr[0][0];
		for ( row = 0; row < index; row++) {
			for(col=0;col<index;col++) {
			if (arr[row][col]>max) {
				 max = arr[row][col];
			}
		}
			
		}
		
		for ( row = 0; row < index; row++) {
			for(col=0;col<index;col++) {
			if (arr[row][col] == max) {
				temp = row;
				temp1 =col;
				break;
			}
		}
		}
		System.out.println("Smallest index of the largest element\nROW - "+temp+"\tcol - "+ temp1);
		
	}

}
