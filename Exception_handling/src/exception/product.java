package exception;

import java.util.Scanner;

public class product {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		
		product objProduct = new product();
		System.out.println("Enter Product Weight : ");
		int w = myScanner.nextInt();
		objProduct.productCheck(w);
	}

	public void productCheck(int weight) {
		if(weight < 100) {
			try {
			throw new MyException("Product is Invalid!");
		}
			catch (Exception e) {
				System.out.println(e);
			}
	}
		else {
			System.out.println("Weight of the product is  : "+ weight);
		}
	}
}
