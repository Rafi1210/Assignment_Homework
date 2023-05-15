package file;

import java.io.*;

public class Lab08_03 {

	public static void main(String[] args) {
		  try {
	            DataInputStream in = new DataInputStream(new BufferedInputStream(
	                    new FileInputStream("Lab08_01.txt")));

	            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(
	                    new FileOutputStream("Lab08_03.dat")));

	            String line;
	            while ((line = in.readLine()) != null) {
	                byte[] bytes = line.getBytes("UTF-8");
	                out.writeInt(bytes.length);
	                out.write(bytes);
	            }

	            in.close();
	            out.close();
	        } catch (IOException e) {
	            System.err.println("Error converting file: " + e.getMessage());
	        }
		
	}

}
