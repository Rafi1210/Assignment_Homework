package objectclass;

import java.util.Scanner;

public class bookmain {
	public static void main(String[] args) {

		int ISBN;
		String bookTitle;
		int numberOfPages;
		int Count;
 		String booktype = null;
		Scanner inpScanner = new Scanner(System.in);
		
		BOOK[] bookarray = new BOOK[5];
		
		int i;
		for (i = 0; i < bookarray.length; i++) {
			System.out.println("BOOKISBN["+(i+1)+"] : ");
			ISBN = inpScanner.nextInt();
			
			System.out.println("BOOKTITLE["+(i+1)+"] : ");
			bookTitle = inpScanner.next();
			
			System.out.println("BOOKPAGES["+(i+1)+"] : ");
			numberOfPages = inpScanner.nextInt();
			
			System.out.println("BOOKCOUNT["+(i+1)+"] : ");
			Count = inpScanner.nextInt();
			
			bookarray[i] = new BOOK(ISBN, bookTitle , numberOfPages, Count);
			System.out.println("BOOKTYPE["+(i+1)+"] : ");
     		System.out.println(bookarray[i].displayAll());
			System.out.println(isHavier(numberOfPages));	
		}

		System.out.println("Comparing Books based on pages:");
        
		for (i = 0; i < bookarray.length-1; i++) {
			System.out.println(bookarray[i].compareTo(bookarray[i+1]));
		}
	}
	
	public static boolean isHavier(int obj){
		if(obj>500) {
			return true;
		}
		else {
			return false;
		}
	}
}
