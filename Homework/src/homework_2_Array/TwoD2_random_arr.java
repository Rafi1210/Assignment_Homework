package homework_2_Array;

import java.util.Scanner;

public class TwoD2_random_arr {

	public static void main(String[] args) {

		int[][] array = new int[100][100];  

		int index;  
		Scanner input =new Scanner(System.in);  
		System.out.print("Enter the number of row index you want to show : ");  
		index = input.nextInt();  
		
		for (int row=0; row<index ;row++)   
		{  
			for (int col = 0; col < index; col++) {
				
				array[row][col] = (int) (1 + Math.random()*100000); 
			    System.out.println("array["+row+"]["+col+"] = "+array[row][col]);
			}  
			System.out.println("\n");
		}
	}

}
