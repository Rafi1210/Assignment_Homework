package practice;
import java.io.*;
import java.util.*;

public class fileTest {

	public static void main(String[] args) throws IOException {

		
//		try(DataOutputStream output = new DataOutputStream(new FileOutputStream("iot.dat"));) {
//			output.writeUTF("Rafi");
//			output.writeDouble(13.5);
//			output.writeUTF("Tanim");
//			output.writeDouble(13.8);
//			output.writeUTF("Learn Java !");
//
//		} 
//
//		try(DataInputStream input = new DataInputStream(new FileInputStream("iot.dat"));){
//			System.out.println(input.readUTF() + " "+ input.readDouble());
//			System.out.println(input.readUTF() + " "+ input.readDouble());
//			System.out.println(input.readUTF()+ " " );
//			
//		}

		
//		FileReader fis = new FileReader("test1.txt");
//		BufferedReader bis  = new BufferedReader(fis);
//		int x;
//		while((x=bis.read())!=-1) {
//		System.out.print((char)x);// read everything from the file
//		}
		//FileReader and FileInputStream are same for buffer

		
		FileInputStream fis = new FileInputStream("test.txt");
		BufferedInputStream bis  = new BufferedInputStream(fis);
		
		 StringBuilder stringBuilder = new StringBuilder();

		    // Read characters and append to StringBuilder
		    int x;
		    while ((x = bis.read()) != -1) {
		        stringBuilder.append((char) x);
		    }

		    // Print the entire content at once
		    System.out.println(stringBuilder.toString());
 
	}	
		
}


