
//Random shuffling

package homework_2_Array;

public class TwoD7_random_shuffle_arr {

	public static void main(String[] args) {
		int[][] arr = {
				       {1,2,3},
			           {4,5,6},
				       {7,8,9}
			           };
		int temp, row ,col,row1,col1;
		for (row = 0; row < arr.length; row++) {
			for (col = 0; col < arr[row].length; col++) {
			  row1 = (int)(Math.random()*arr.length);
			  col1 = (int)(Math.random()*arr[row].length);
			  
		    temp = arr[row][col];
			arr[row][col] = arr[row1][col1];
			arr[row1][col1] = temp;
			System.out.print(arr[row1][col1]+"\t");			
			}
			System.out.println("\n");
		}
	}
}
