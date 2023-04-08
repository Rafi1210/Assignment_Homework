package LAB_4;


import java.util.*;

public class exercise_3 {

	public static void main(String[] args) {

		int array[][] = new int[1000][7];

		int temp[] = new int[1000];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of employee : ");
		int index = input.nextInt();
		System.out.println("Enter employee's weekly time ");

		//input..
		for (int row = 0; row < index; row++) {
			System.out.print("Employee " + row + " : ");
			for (int col = 0; col < 7; col++) {
			array[row][col] = input.nextInt();		
			} 	
		}
		// matrix output
		System.out.println("\t     S  M  T  W  Th  F  Sa");
		for (int row = 0; row < index; row++) {
			System.out.print("Employee " + row + " : ");
			for (int col = 0; col < 7; col++) {
				System.out.print(array[row][col]+"  ");
			} 	
			System.out.println("");
		}
		System.out.println("");
		int sum;
		for (int row = 0; row < index; row++) {
		
			sum = 0; 
			/*if sum is not 0 here then it will sum also the summation 
			of 1st row and add it with the following rows*/
			for (int col = 0; col < 7; col++) {
				
			sum = sum + array[row][col];		

			temp[row] = sum;
			}		
		
			System.out.println("Working hour of employee "+ row +" is "+temp[row]);
			
		}
		
		int temp1=0;
		for(int i = 0; i < temp.length; i++) {
			for (int j = i+1; j < temp.length; j++) {
				
				if (temp[i]<temp[j]) {
					
					temp1 = temp[i];
					temp[i] = temp[j];	
					temp[j] = temp1;
				
				}
			}	
		}
		
		System.out.println("Total working hours of employees in decreasing order");
	    for (int i = 0; i < index; i++) {   
		 System.out.print(temp[i]+"  ");
	    }
	   
	}
}
