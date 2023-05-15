package practice;

import java.io.Serializable;

public class Serializable_Student implements Serializable {

	int rollno;
	String name, dept;
	float avg;
	Serializable_Student(){
		
	}

	public Serializable_Student(int r, String n, String d)
	{
		rollno = r;
		name = n;
		dept = d;
	}
	public String toString() {
		return "\n Student details - \n"+
	"\nRoll No : "+ rollno+
	"\nName : " + name+
	"\nDept. : "+ dept;
	}
}
