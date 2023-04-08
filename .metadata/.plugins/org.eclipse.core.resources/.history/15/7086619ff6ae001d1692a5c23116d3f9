
//Finding the smallest index of the largest element

package homework_2_Array;

import java.util.Scanner;

public class OneD6_small_index_arr {

	public static void main(String[] args) {

		double[] arr = new double[100];
		Scanner input = new Scanner(System.in);
		int index ,i, temp=0;
		System.out.println("Enter number of index : ");
		index = input.nextInt();
	 
		System.out.println("Enter values");
 
		for ( i = 0; i < index; i++) {
			System.out.print("arr["+ i +"] = ");
			arr[i] = input.nextDouble();
		}
		
		
		double max = arr[0];
		for ( i = 0; i < index; i++) {
			if (arr[i]>max) {
				 max = arr[i];
			}
		}
		for (i = 0; i < index; i++) {
			if (arr[i] == max) {
				temp = i;
				break;
			}
		}
		System.out.println(temp);
	}

}
