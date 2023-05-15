package exception;

import java.util.*;

public class LAB03 {

	public static void main(String[] args) {

		int[] arr = new int[100];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000);
            System.out.println(arr[i]);
        }

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the number of index : ");
        int index = myScanner.nextInt();

        try {
            int value = arr[index];
            System.out.println("The value at index " + index + " is " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage()+"\nOut of Bounds!");
        }
		
	}

}
