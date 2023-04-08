package objectClass;

public class BOOK {

	private  int ISBN;
	private String bookTitle;
	private  int numberOfPages;
	private static int Count;
	
	BOOK(){	
	}
	
	
	BOOK(int is, String bt, int np){
		this.ISBN = is;
		this.bookTitle = bt;
		this.numberOfPages = np;
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
	
	String displayAll() {
		return "ISBN : "+ISBN+
				"\nbookTitle : "+bookTitle+
				"\nnumberOfPages : "+numberOfPages;
//				"Count : "+Count;
				
	}

    public  int compareTo(BOOK comp) {
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
