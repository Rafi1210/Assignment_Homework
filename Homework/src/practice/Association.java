package practice;

import java.util.ArrayList;

class Student {
    private int id;
    private String name;
    private ArrayList<Course> cou;
    
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        
        cou = new ArrayList<Course>(); // [java, python]
    }
    
    public void addCourse(Course c) {
        cou.add(c);
    }
    
    public int getNumberOfCourses() {
        return cou.size();
    }
}

class Course {
    private String courseName;
    private String courseCode;
    
    private ArrayList<Student> stds; //[308, tanim]
    
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        
        stds = new ArrayList<Student>(); //[308, tanim]
    }
    
    public String getCourseName(){
        return courseName;
    }
    
    public void addStudent(Student s) {
        stds.add(s);
    }
    
    public int getNumberOfStudents() {
        return stds.size();
    }
}

class Association{
    public static void main(String[] args) {
        
    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Course> courses = new ArrayList<Course>();
    
    // Create new students
    Student s1 = new Student(1, "John");
    Student s2 = new Student(2, "Sarah");
    
    // Add students to the students ArrayList
    students.add(s1);
    students.add(s2);

    // Create new courses
    Course java = new Course("Java", "CS110");
    Course python = new Course("Python", "CS210");
    Course database = new Course("Database", "CS310");
    
    // Add courses to the courses ArrayList
    courses.add(java);
    courses.add(python);
    courses.add(database);

    // Add students to courses and courses to students
    java.addStudent(s1);
    java.addStudent(s2);
    
    python.addStudent(s1);
    database.addStudent(s2);
    
    // courses taken by students
    s1.addCourse(java);
    s1.addCourse(python);
    s2.addCourse(java);
    s2.addCourse(database);
    
    // To find out how many courses a student has taken
    System.out.println("John has taken " + s1.getNumberOfCourses() + " courses.");
    System.out.println("Sarah has taken " + s2.getNumberOfCourses() + " courses.");
    // To find out how many students are taking a course
    System.out.println(java.getCourseName() + " has " + java.getNumberOfStudents() + " students.");
}
}