
//summing all elements

package homework_2_Array;

import java.util.Scanner;

public class OneD4_sum_elements_arr {

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
		double sum =0;
		for(int i =0;i<index ; i++) {
			sum = sum + arr[i];
		}

		System.out.println("The sum of the array is : "+sum);
		
	}

}
