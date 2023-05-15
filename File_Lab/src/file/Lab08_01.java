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
	    }
}


