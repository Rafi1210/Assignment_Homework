package practice;


	
	
	class ISBN{
		String isbn  ;
		ISBN(){
			
		}
		
		ISBN(String i ){
		isbn = i;	
		}
		
		public String displayString() {
			return isbn;
		}

		public String getIsbn() {
			return isbn;
		}

		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
	}
	
	class Book{
		String bookName, author,isbnnum, price;
		
		Book(){
			
		}
		public Book(String n, String a, String iN, String p) {
			bookName = n;
			author = a;
			isbnnum = iN;
			price = p;
		}
	public String setisbn() {
		return isbnnum;
	}
	public String displaybookString() {
		return " Book Name : "+bookName+
				"\n Book Author : "+author+
				"\n ISBN : "+isbnnum+
				"\n Price : "+price;
	}

}
	public class Quiz_2 {

	public static void main(String[] args) {

		Book obj;
		obj = new Book("java", "Rafi", "1234567", "300");
		System.out.println(obj.displaybookString());
	}

}
