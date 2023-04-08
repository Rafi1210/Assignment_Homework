package objectclass;

public class BOOK {


	private static int ISBN;
	private static String bookTitle;
	private static  int numberOfPages;
	private static int Count;
	
	BOOK(){	
	}
	
	BOOK(int is, String bt, int np, int ct){
		this.ISBN = is;
		this.bookTitle = bt;
		this.numberOfPages = np;
		this.Count = ct;
	}

//	public void setisbn(int isbn){
//		this.ISBN = isbn;
//	}
//	public int getisbn() {
//		return ISBN;
//	}
//	
//	public void settitle(String title){
//		this.bookTitle = title;
//	}
//	public String gettitle() {
//		return bookTitle;
//	}
//	
	public void setpages(int pages){
		this.numberOfPages = pages;
	}
	public int getpages() {
		return numberOfPages;
	}
	public void setcount(int count){
		this.Count = count;
	}
	public int getcount() {
		return Count;
	}
	
	static String displayAll() {
		return "ISBN : "+ISBN+" bookTitle : "+bookTitle+" numberOfPages : "+numberOfPages+" Count : "+Count;
	}

    public static int compareTo(BOOK comp) {
    	 if (numberOfPages>comp.getpages()) {
 			return 1;
 		}
    	 else if(numberOfPages == comp.getpages()) {
			return 0;
		}

		else {
			return -1;
		}		
	}
}
