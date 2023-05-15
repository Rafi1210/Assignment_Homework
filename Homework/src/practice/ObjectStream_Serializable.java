package practice;

import java.io.*;

public class ObjectStream_Serializable {

	public static void main(String[] args) throws Exception {
//
//		FileOutputStream fos = new FileOutputStream("student3.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		
//		Serializable_Student s3 = new Serializable_Student(20, "Rafi", "CSE!");
//		
//		oos.writeObject(s3);
//		fos.close();
//		oos.close();

		
		FileInputStream fis = new FileInputStream("student3.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Serializable_Student s4= (Serializable_Student) ois.readObject();
		System.out.println(s4);
		ois.close();
		fis.close();
	}

}
