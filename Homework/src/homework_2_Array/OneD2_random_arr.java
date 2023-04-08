
//Initializing arrays with random values 

package homework_2_Array;

import java.util.*;

public class OneD2_random_arr {

	public static void main(String[] args) {
		
		int[] array = new int[100];  

		int index;  
		Scanner input =new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to show : ");  
		index = input.nextInt();  
		
		for (int i=0; i<index ;i++)   
		{  
			array[i] = (int) (1 + Math.random()*100000); 
		    System.out.println("array["+i+"] = "+array[i]);  
		}
	}

}
