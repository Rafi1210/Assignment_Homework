package LAB_3;

import java.util.*;

public class exercise_4 {
	//Method to count distinct numbers 
	static void isDistinct(int arr[]) {
		int count = 1;   // count is not zero because , for every unique number it is 1 
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]!=arr[i+1]) {
				System.out.print(arr[i]+" ");
				count++;
			}
		}
		System.out.print(arr[arr.length-1]);   // this is for the last index of array
		System.out.println("\nNumber of distinct numbers : "+ count);
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] arr = new int[10];

		//loop for input value 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		
		Arrays.sort(arr); // sorting input numbers 
		isDistinct(arr);	// call method	
	}

}
