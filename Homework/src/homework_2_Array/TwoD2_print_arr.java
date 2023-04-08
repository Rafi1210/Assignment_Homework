package homework_2_Array;

public class TwoD2_print_arr {

	public static void main(String[] args) {

		int[][] array = new int[10][10];

		System.out.println("Array Index\tROW\tCOL\n");
		for (int row =0 ; row<array.length;row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print("arr["+ row +"]["+col+"] : \t");
				System.out.println(row+"\t"+col);
			
			}
			System.out.println("\n");
	}

	}
	
	}
