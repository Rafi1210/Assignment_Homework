package LAB_4;

import java.util.*;

public class exercise_5 {

	public static void main(String[] args) {

		int[][] array = new int[4][4];
		Scanner input = new Scanner(System.in);
		int index ;
	
	 
		System.out.println("Enter values");
 
		for (int row = 0; row < array.length; row++) {
			
			for (int col = 0; col < array.length; col++) {
				System.out.print("arr["+ row +"]["+col+"] = ");
				array[row][col] = input.nextInt();
			}
			System.out.println("\n");
		}
		
		System.out.print("Enter Column number : ");
		index = input.nextInt();
		
		System.out.println("Given matrix - \n");
		for (int row =0 ; row<array.length;row++) {
			for (int col = 0; col < array.length; col++) {
				
				System.out.print(array[row][col]+" ");

			}
			System.out.println("\n");
			
		}
		
		
		System.out.println("Sorted Matrix - \n");
		sortCol(array, index);// call sortcol method
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j]+ " ");
			}
			System.out.println("\n");
		}
	}
		
		
	
	public static void sortCol(int[][] arr, int colnum) {
		Arrays.sort(arr, new Comparator<int[]>() { //using comparator interface to Compare its two arguments for ordering
 

			public int compare(int[] num1, int[] num2) {

				if(num1[colnum-1]>num2[colnum-1]) { //comparing between the rows
					return 1; //positive value for the ascending order. if the return type is negative then it will show descending order
				}

				else {
					return -1;
				}
				
			}
			
		});
		
	}

	
}
