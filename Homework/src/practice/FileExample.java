package practice;

import java.io.*;

public class FileExample {

	public static void main(String[] args) throws Exception { // it will handle all the exception//

	
		
try (FileWriter fw = new FileWriter("Test1.txt")){
			fw.write("1. Model - Design \n");
			fw.write("Rafi\n");
			fw.write("21/22, D");
		}




try (FileReader fr = new FileReader("Test1.txt")){
	int x;
	
	while ((x= fr.read())!=-1) {
		System.out.print((char)x);
	}
	
}
	
//		 PrintWriter writer = new PrintWriter(System.out);    
//	      writer.write("Javatpoint provides tutorials of all technology.");        
//	      	writer.flush();  
//	      writer.close();  
//	//Data to write in File using PrintWriter       
//	        PrintWriter writer1 = new PrintWriter(new File("testout.txt"));  
//	         writer1.write("Like Java, Spring, Hibernate, Android, PHP etc.");                                                   
//	         writer1.flush();  
//	         writer1.close();  
	}
}
