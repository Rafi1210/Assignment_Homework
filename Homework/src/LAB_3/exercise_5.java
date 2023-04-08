package LAB_3;

public class exercise_5 {
		
	//method for largest index and value
			public static void largest(int arr[]) {
				int tempLarge = 0;
				int max = arr[0];
				for ( int i = 0; i < arr.length; i++) {
					if (arr[i]>max) {  
						max = arr[i];	 
						tempLarge = i;
					}				

				}
				
				System.out.println("The largest element is "+max+" and index number is "+ tempLarge);
			}
			
			//method for smallest index and value
			 public static void smallest(int arr[]) {
				 int tempSmall=0;

				int min = arr[0];
				
				for ( int i = 0; i < arr.length; i++) {
					if (arr[i]<min) {  
						min = arr[i];
						tempSmall = i;
			
					}
				}
				
				System.out.println("The smallest element is : "+min+" and index number is "+ tempSmall);	        
		    }    
			 
	 public static void main(String[] args){

	    int[] arr = new int[100];
		int i;
		// loop for input array which is randomly generating values
		for ( i=0; i<arr.length ;i++)   
		{  
			arr[i] = (int) (1 + Math.random()*100); 
		    System.out.println("array["+i+"] = "+arr[i]);  
		}
		
		largest(arr); //call methods
		smallest(arr);
	}
		

}
