
//Random shuffling

package homework_2_Array;

public class OneD7_random_shuffle_arr {

	public static void main(String[] args) {


		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int shuffle=0, temp;
		for (int i = 0; i < arr.length; i++) {
			 shuffle = (int)(Math.random()*arr.length);
			
		    temp = arr[i];
			arr[i] = arr[shuffle];
			arr[shuffle] = temp;
			System.out.print(arr[shuffle]+" ");
		}
		
	}

}
