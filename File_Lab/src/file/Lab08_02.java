package file;


	import java.io.*;
	import java.util.Random;

	public class Lab08_02 {
	    public static void main(String[] args) {
	        try {
	            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(
	                    new FileOutputStream("Lab08_02.dat")));

	            Random random = new Random();
	            for (int i = 0; i < 100; i++) {
	                dos.writeInt(random.nextInt(100));
	            }

	            dos.close();
	        } catch (IOException e) {
	            System.err.println("Error writing to file: " + e.getMessage());
	        }
	        try {
				DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("Lab08_02.dat")));
				
				  while (dis.available() > 100) {
			            int number = dis.readInt();
			            System.out.print(number+"	");
			        }
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	    }
	}
