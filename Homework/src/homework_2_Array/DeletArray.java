package homework_2_Array;

import java.util.Scanner;

public class DeletArray {

	public static void main(String[] args) {

		int[] arr = new int[100];
		
		Scanner input = new Scanner(System.in);
		int index,i,delete ;
		System.out.println("Enter number of index : ");
		index = input.nextInt();
		
		for ( i = 0; i < index; i++) {
			System.out.print("arr["+ i +"] = ");
			arr[i] = input.nextInt();
		}
		System.out.println("Enter the index number you want to delete : ");
		delete = input.nextInt();

		
		for (i = delete; i < index; i++) {
			arr[i] = arr[i+1];	
			}
		
		
		for (i = 0; i < index-1; i++) {
			System.out.print(arr[i]+ " ");
			
		}
	
	}
			
	}

