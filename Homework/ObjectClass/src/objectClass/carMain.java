package objectClass;

import java.util.Scanner;

public class carMain {
	
	public static void main(String[] args) {
		
		Scanner inpScanner = new Scanner(System.in);
		//This are for the array
		String cartype;
		String carcompany;
		double carprice;
//		
//		CAR obj1,obj2;// calls default constructor 
//		obj1 = new CAR();
//		System.out.println("CARTYPE: ");
//		obj1.setcarType(inpScanner.next());
//		obj1.setcarCompany(inpScanner.next());
//		obj1.setcarPrice(inpScanner.nextDouble());
//		System.out.println(obj1.display());
//		obj2 = new CAR();
//		obj2.setcarType(inpScanner.next());
//		obj2.setcarCompany(inpScanner.next());
//		obj2.setcarPrice(inpScanner.nextDouble());
//		System.out.println(obj2.display());
//		System.out.println(obj1.equals(obj2));

		int i;
		CAR[] cararray = new CAR[100];
		System.out.println("Enter number of car: ");
		int index = inpScanner.nextInt();
		for ( i = 0; i < index; i++) {
			System.out.println("CARTYPE["+(i+1)+ "]: ");
			cartype = inpScanner.next();
			System.out.println("CARCOMPANY["+(i+1)+"]: ");
			carcompany = inpScanner.next();
			System.out.println("CARPRICE["+(i+1)+"]:  ");
			carprice = inpScanner.nextDouble();	
			cararray[i] = new CAR(cartype,carcompany,carprice);//to access CAR class 
			System.out.println(cararray[i].display());	
	}	
		for ( i = 0; i < index-1; i++) 
		{
		System.out.println(cararray[i].equals(cararray[i+1]));	
		System.out.println(cararray[i].compareTo(cararray[i+1]));
		}
		
	}
}