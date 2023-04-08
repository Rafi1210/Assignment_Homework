
//Shifting elements

package homework_2_Array;

public class OneD8_shift_element_arr {

	public static void main(String[] args) {

		double[] arr = {1,2,3,4,5,6,7,8,9,10};


		for(double i:arr) {
			System.out.print(i+"\t");
		}
		System.out.println("\n");
		
		double temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			
			arr[i-1] = arr[i];
		}

		arr[arr.length-1] = temp;
		
		
		for(double i : arr)
		{
			System.out.print(i+"\t");
		}
	}

}
