package LAB_4;

public class exercise_1 {

	public static void main(String[] args) {
	
		int[][] matrix = new int[4][4];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
			matrix[row][col] = (int)(0+Math.random()*2);
			System.out.print(matrix[row][col]);
			
	}
			System.out.println(" ");
		}		
		System.out.println("The largest row index : "+largestrow(matrix));
		System.out.println("The largest col index : "+largestcol(matrix));
		
	}
	
	public static int largestrow(int[][] x) {
		
		int temp = 0;
		int max = 0;
		for (int row = 0; row < x.length; row++) {
			int count =0;
			for (int col = 0; col <x[row].length; col++) {
			if (x[row][col]==1) {
				count++;
			}
			
			if (count > max) {
				max = count; 
				temp = row;
	 	    } 					
		 }
	  }
		return temp;
   }
	
	
   public static int largestcol(int[][] x) {
	   int temp1 = 0;
	   int max = 0;
		   for (int col = 0; col <x[0].length; col++) {
			int count =0;
			   for (int row = 0; row < x.length; row++) {
			if (x[row][col]==1) {
				count++;
			}
			
			if (count > max) {
				max = count;
				temp1 = col;			 
			}			
        }   			
	}
		return temp1;		
  }   

}
