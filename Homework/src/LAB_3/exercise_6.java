
package LAB_3;

import java.util.*;

public class exercise_6 {
	
	public static void main(String[] args) {
		int[] arr = new int[100];
		String[] name = new String[100];
		Scanner input = new Scanner(System.in);
		int index , score , i , j , temp = 0;
		String tempstString ;
		System.out.println("Enter number of students : ");
		index = input.nextInt();
	 
		
		for ( i = 0; i < index; i++) {
			//student name input
			System.out.print("Student "+ (i+1) +" name  = ");
			name[i] = input.next();				
			//student score input 
		    System.out.print("Student "+ (i+1) +" score = ");
	    	arr[i] = input.nextInt();	
		
		}
	
		     	//Descending sort
		for ( i = 0; i < index; i++) {  
			for (j = i+1; j < index; j++) {
				if(arr[i] < arr[j])
	            {
	                //for string descending order
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
	                tempstString = name[i];
	                name[i] = name[j];
	                name[j] = tempstString;
	            }
		}		
}		
		//print the name in descending order 
		System.out.println("Students name in descending order is : ");
		for ( i = 0; i < index; i++) { 

			System.out.println(name[i]+"");
			//is not printing in descending order 
			}
	}
}


