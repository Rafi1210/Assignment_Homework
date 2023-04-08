package objectclass;

import java.util.Scanner;

public class Icecream {
	 static Scanner input = new Scanner(System.in);

		public static void main(String[] args) {

			String icecreamtype;
			String icecreamcompany = null;
			double icecreamprice = 0;

			Ice[] icecreamArray = new Ice[100];

			System.out.println("Enter size of array(ICECREAMCOMPANY) : ");
			int index = input.nextInt();

			for (int i = 0; i < index; i++) {
				if(index < 5) {
					System.out.println("The size of array must be at least 5!");
					break;
				}

				else {

				System.out.print("ICECEAMTYPE["+ (i+1)+ "] : ");
				icecreamtype = input.next();
				System.out.print("ICECEAMCOMPANY["+ (i+1)+ "] : ");
				icecreamcompany = input.next();
				System.out.print("ICECEAMPRICE["+ (i+1)+ "] : ");
				icecreamprice = input.nextDouble();	
				
	           icecreamArray[i]= new Ice(icecreamtype,icecreamcompany,icecreamprice);         
	           System.out.println(icecreamArray[i].display());
				}
		}
		    	searchByCompany(icecreamArray, icecreamcompany, icecreamprice);
	}
		
		static void searchByCompany(Ice[] icecr, String com, double icecreamprice) {
			 System.out.println("Enter company name to know all icecream's information manufactured by the company : ");
			String  companyname = input.next();
			for (int i = 0; i < icecreamprice; i++) {
				if (icecr[i].getCompany().equals(com)) {			
					System.out.println("ICECREAMTYPE : "+icecr[i].getType());
					System.out.println("ICECREAMPRICE : "+icecr[i].getPrice());
					}
			}
				
		}
		

}
