
//Grading multiple choice test

package homework_2_Array;

import java.util.Scanner;

public class Grading_multiple_choice_array {

	public static void main(String[] args) {

		String[] keys = {"D","B","D","C","C","D","A","E","A","D"};
		String[][] answers = new String[100][10];
		Scanner myScanner = new Scanner(System.in);
		
		int index,row,col ;
		System.out.println("Enter number of student : ");
		index = myScanner.nextInt();
		for (row = 0; row < index; row++) {
			for (col = 0; col < answers[row].length; col++) {
				System.out.print("arr["+ row +"]["+col+"] = ");

				answers[row][col] = myScanner.next();

			}
			System.out.println("\n");

		}
		
		for (row = 0; row < index; row++) {
			int count =0;
			for (col = 0; col < answers[row].length; col++) {
				if (answers[row][col].equalsIgnoreCase(keys[col])) {
					count++;
				}
			}
			System.out.println("Student "+row+" - "+count+" correct MCQ.");

		}

	}

}
