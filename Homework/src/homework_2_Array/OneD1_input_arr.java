
//Initializing arrays with input values

package homework_2_Array;

import java.util.Scanner;

public class OneD1_input_arr {

	public static void main(String[] args) {
		double[] arr = new double[100];
		Scanner input = new Scanner(System.in);
		int index ;
		System.out.println("Enter number of index : ");
		index = input.nextInt();
	 
		System.out.println("Enter values");
 
		for (int i = 0; i < index; i++) {
			System.out.print("arr["+ i +"] = ");
			arr[i] = input.nextDouble();
		}
		
		System.out.println("The values are - ");
		
		for (int i = 0; i < index; i++) {
			System.out.println(arr[i]);
		}
	}

}
