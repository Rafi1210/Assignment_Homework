package practice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class SerilizableExp {

	public static void main(String[] args) throws NumberFormatException, IOException {
//try {
//	FileOutputStream fos = new FileOutputStream("student.txt");
//	PrintStream ps= new PrintStream(fos);
//	
//	Serializable_Student s = new Serializable_Student();
//	s.rollno = 10;
//	s.name = "Rafi";
//	s.dept = "cse";
//	ps.println(s.rollno);
//	ps.println(s.name);
//
//	ps.println(s.dept);
//
//	ps.close();
//	fos.close();
//} catch (FileNotFoundException e) {
//	e.printStackTrace();
//} catch (IOException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}

FileInputStream fis = new FileInputStream("student.txt");
BufferedReader br = new BufferedReader(new InputStreamReader(fis));

Serializable_Student s = new Serializable_Student();
 		s.rollno = Integer.parseInt(br.readLine());
 		s.name = br.readLine();
 		s.dept = br.readLine();
 		System.out.println(s.rollno);
 		System.out.println(s.name);
 		System.out.println(s.dept);
	}

}
