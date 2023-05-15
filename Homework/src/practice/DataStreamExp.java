package practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamExp {

	public static void main(String[] args) throws Exception{
		
		FileOutputStream fos = new FileOutputStream("student2.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		Serializable_Student s = new Serializable_Student();
		s.rollno = 10;
		s.name = "Rafi";
		s.dept = "CSE";
		s.avg = 20.3f;
		dos.writeInt(s.rollno);
		dos.writeUTF(s.name);
		dos.writeUTF(s.dept);
		dos.writeFloat(s.avg);
		
		dos.close();
		fos.close();
		
		
		FileInputStream fis = new FileInputStream("student2.txt");
		DataInputStream dis = new DataInputStream(fis); 
		
		Serializable_Student s1 = new Serializable_Student();
		s1.rollno = dis.readInt();
		s1.name = dis.readUTF();
		s1.dept = dis.readUTF();
		s1.avg = dis.readFloat();

		System.out.println(s1.rollno);
		System.out.println(s1.name);
		System.out.println(s1.avg);
		System.out.println(s1.dept);
		
		dis.close();
		fis.close();
		
	}

}
