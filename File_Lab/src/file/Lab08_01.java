package file;

import java.util.*;
import java.io.*;
public class Lab08_01 {

	  public static void main(String[] args) {
	        try {
	            FileWriter fw = new FileWriter("Lab08_01.txt");
	            BufferedWriter bw = new BufferedWriter(fw);

	            Random random = new Random();
	            for (int i = 0; i < 100; i++) {
	                bw.write(random.nextInt(100) + "	");
	            } 

	            bw.close();
	            fw.close();
	        } catch (IOException e) {
	            System.err.println("Error writing to file: " + e.getMessage());
	        }
	        
	        try {
				FileReader fr = new FileReader("Lab08_01.txt");
				int x;
				while((x=fr.read())!= -1) {
					System.out.print((char)x);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	        
	    }
}


