package association_inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

	private int studentid;
	private String studentname;
	private double studentCGPA;
	private ArrayList<Course> courses = new ArrayList<Course>();
    private int numberOfcourses = 0;
	
	Student(){	
	}
	
	public int getNumberOfcourses() {
		return numberOfcourses;
	}

	public void setNumberOfcourses(int numberOfcourses) {
		this.numberOfcourses = numberOfcourses;
	}

	Student(int studentid,String studentname, double studentCGPA){
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentCGPA = studentCGPA;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public double getStudentCGPA() {
		return studentCGPA;
	}

	public void setStudentCGPA(double studentCGPA) {
		this.studentCGPA = studentCGPA;
	}
	
    public String studentdisplay()
    {
		return "Studentid : "+studentid+" Studentname"+studentname +" StudentCGPA : "+studentCGPA ;
    }
    
    
    public void displaytakenCourses() {
        for(Course c : courses) {
            System.out.println();
            c.coursedisplay();
        }
    }
    
}
