package LAB_4;

import java.util.*;

public class exercise_4 {

	public static void main(String[] args) {

	ArrayList<String> myList = new ArrayList<String>();
	Scanner input = new Scanner(System.in);
	int index = input.nextInt();
	
	do {
			myList.add(input.nextLine());
		}while(myList.size() <= index);
			
		Collections.sort(myList);
		System.out.println(myList);
		
	}

}
