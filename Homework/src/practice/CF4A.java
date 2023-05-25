package practice;

import java.util.Scanner;

public class CF4A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int w = input.nextInt();
		if (w<=2 && w%2!= 0) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
	}

}
