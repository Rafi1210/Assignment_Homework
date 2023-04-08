package association;

import java.util.ArrayList;

public class Course {
	private String courseId;
	private String courseTitle;
	private double credit;
	
	private ArrayList<Student> students = new ArrayList<Student>(40);
	private int numberOfStudents = 0;
	private Faculty faculty;
//	private Course course;
	
	public Course(){		
	}
	public Course(String courseId,String courseTitle, double credit)
	{
		this.courseId=courseId;
		this.courseTitle=courseTitle;
		this.credit=credit;		
	}
	
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	
	 public String coursedisplay()
	    {
			return "CourseId : "+courseId+"CourseTitle"+courseTitle +"Credit : "+credit ;			
		}	  
	 
	 
	 public void addStudent(Student student) {
		 students.add(student);
		 numberOfStudents++;
	 }	 
	 
	 
	 public void addFaculty(Faculty f) {
			  
		 faculty =f;
		 
	 }
	 
	 
	 
	 public void dropStudent(int studentdropid) { 
		 
		 for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getStudentid()==studentdropid) {
				students.remove(i);
				break;
			}
		}
		 numberOfStudents--;
		 
	 }
	  
	 public void dropFaculty(Faculty id) {
	
	 faculty = null;
	 
	 }
	 
	 public void printstudentlist() {
		 
		 for(Student s: students) {
	            System.out.println();
	            s.studentdisplay();
	        }
	 
	 }
}
