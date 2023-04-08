package association_inheritance;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner inpScanner = new Scanner(System.in);
		ArrayList<Faculty> faculties = new ArrayList<>();
		ArrayList<Course> courses = new ArrayList<>();
		ArrayList<Student> students = new ArrayList<>();
		
		
		boolean exit = false;
		
		        while (!exit){
			System.out.println("1. Add");
			System.out.println("2. Delete");
			System.out.println("3. Update");
			System.out.println("4. Print");
			System.out.println("5. Search");
			
			
			System.out.println("Enter any option to operate(1 to 5)  - ");
			
			int operation = inpScanner.nextInt();
			
					switch (operation) {
					case 1: {		

						boolean innerExit = false;
						while(!innerExit) {
							System.out.println("1. Add a student");
							System.out.println("2. Add a course");
							System.out.println("3. Add a faculty");	
							System.out.println("4. Exit! ");
				
							System.out.println("Choose option - ");
							int addoption = inpScanner.nextInt();	
								
							
								switch (addoption) {
								case 1: {

									for (int i = 0; i < 40; i++) {

										System.out.print("Enter student id: ");
										int studentid = inpScanner.nextInt();
										System.out.print("Enter student name : ");
										String studentname = inpScanner.next();
										System.out.print("Enter student cg : ");
										Double studentcg = inpScanner.nextDouble();
							        
										Student stuobj = new Student(studentid,studentname,studentcg);

										students.add(stuobj);
										break;

								}
									break;
					}	
								case 2 : {
									
									for (int i = 0; i < 3; i++) {

										System.out.print("Enter Course id: ");
										String courseid = inpScanner.next();
										System.out.print("Enter Course name : ");
										String coursename = inpScanner.next();
										System.out.print("Enter Course credit : ");
										Double coursecredit = inpScanner.nextDouble();
							        
										Course courseobj = new Course(courseid,coursename,coursecredit);
										courses.add(courseobj);
										break;

									}
									break;
								}
								
								case 3 :{
						  
									for (int i = 0; i < 1; i++) {

										System.out.print("Enter Faculty id: ");
										int facultyid = inpScanner.nextInt();
										System.out.print("Enter Faculty name : ");
										String facultyname = inpScanner.next();
										System.out.print("Enter Faculty position : ");
										String facultyposition = inpScanner.next();
							        
										Faculty facultyobj = new Faculty(facultyid, facultyname, facultyposition);
										faculties.add(facultyobj);
										break;

									}
									break;
								}
								case 4:
				                    innerExit = true;
				                    break;
				
								
								default :
									System.out.println("Invaid operation!!!(Choose between 1 to 3)\nProgram exit!");
									break;						
									
								}
							}	
						break;
					}
							
					
			
					case 2: {
				
						boolean innerExit = false;
						while(!innerExit)  {
								System.out.println("1. Delete a student");
								System.out.println("2. Delete a course");
								System.out.println("3. Delete a faculty");
								System.out.println("4. Exit! ");
				
				
								System.out.println("Choose option - ");
								int deleteoption = inpScanner.nextInt();
							
								
							
								switch (deleteoption) {
								case 1: {
									
									System.out.println("Enter student id to delete: ");
									
									int deleteid = inpScanner.nextInt();
									for (int i = 0; i < students.size(); i++) {
										if (deleteid==students.get(i).getStudentid()) {
											students.remove(i);
											break;
										}

										
									}
									System.out.println("Deleted");
									break;
								}
								case 2 : {
							
									System.out.println("Enter course id to delete: ");
									
									String  deletecourse = inpScanner.next();
									for (int i = 0; i < courses.size(); i++) {

										if (deletecourse==courses.get(i).getCourseId()) {
											courses.remove(i);
											break;
										}
									
									}
									System.out.println("Deleted");

									break;			
									
								}
								
								case 3 :{
						  
									System.out.println("Enter faculty id to delete: ");
									
									int deletefaculty = inpScanner.nextInt();
									for (int i = 0; i < faculties.size(); i++) {

										if (deletefaculty==faculties.get(i).getFacultyId()) {
											faculties.remove(i);
											break;
										}
									}
									System.out.println("Deleted");

									break;
								}
								case 4:
						            innerExit = true;
						            break;
								default :
									System.out.println("Invaid operation!!!(Choose between 1 to 3)\nProgram exit!");
						break;
						}
						
					}
						
						break;
					}
		
					
				case 3: {			
					boolean innerExit = false;
					
							while(!innerExit) {
							System.out.println("1. Update student information");
							System.out.println("2. Update course information");
							System.out.println("3. Update faculty information");
							System.out.println("4. Exit! ");

					
							System.out.println("Choose option - ");
							int updateoption = inpScanner.nextInt();	
								
							
								switch (updateoption) {
								case 1: {
								
								        System.out.println("Enter Students ID to Update - ");
								        int studentid = inpScanner.nextInt();               
								        for (int j = 0; j < students.size(); j++) {
								                if (studentid == students.get(j).getStudentid()) {
								                	System.out.println("Enter student new name : ");
								                    students.get(j).setStudentname(inpScanner.next());
								                }       
									
										}
								        break;
								}
								
								case 2 : {
									
									  System.out.println("Enter Course ID to Update");
								        String courseid = inpScanner.nextLine();               
								        for (int j = 0; j < courses.size(); j++) {
								                if (courseid == courses.get(j).getCourseId()) {
								                	System.out.println("Enter course new name : ");
								                    courses.get(j).setCourseTitle(inpScanner.nextLine());
							                }       
								
									}
							        break;		
									
								}
								
								
								case 3 :{
									 System.out.println("Enter Faculty ID to Update");
								        int facultyid = inpScanner.nextInt();               
								        for (int j = 0; j < faculties.size(); j++) {
								                if (facultyid == faculties.get(j).getFacultyId()) {
								                	System.out.println("Enter faculty new name : ");
								                    faculties.get(j).setFacultyName(inpScanner.nextLine());
								                }       
									
										}
								        break;
								}
								case 4:
					                innerExit = true;
					                break;
								
								default :
									System.out.println("Invaid operation!!!(Choose between 1 to 3)\nProgram exit!");
					                break;
					
								}
						}
					
					
					break;
					}
									
					case 4: {
						
						boolean innerExit = false;
						
						while(!innerExit) {
							System.out.println("\n");
							System.out.println("1. Print All Students");
	                        System.out.println("2. Print All Course");
	                        System.out.println("3. Print All Faculty");
	                        System.out.println("4. Print informaion of a student");
	                        System.out.println("5. Print information of a course");
	                        System.out.println("6. Print information of a faculty");
	                        System.out.println("7. Print student list and faculty information of a course");
	                        System.out.println("8. Print courses taken by a student");
							System.out.println("9. Exit! ");

						System.out.println("Choose option - ");
						int searchoption = inpScanner.nextInt();	
							
						
							switch (searchoption) {
							case 1: {
							
								  System.out.println("Student Information - ");

								  System.out.println("Student ID\t Student Name\t Student CGPA");
								for (int i = 0; i < students.size(); i++) {
									System.out.print(students.get(i).getStudentid()+"\t\t"); 
									System.out.print(students.get(i).getStudentname()+"\t\t");
									System.out.print(students.get(i).getStudentCGPA()+"\t\t");
									System.out.println("\n");


								}
							       
								break;
							}
							
							case 2 : {
								
								  System.out.println("Course Information - ");
								  System.out.println("Course ID\t Course Title\t Course Credit");

							        for (int i = 0; i < courses.size(); i++) {
							        
							        	System.out.print(courses.get(i).getCourseId()+"\t\t"); 
										System.out.print(courses.get(i).getCourseTitle()+"\t\t");
										System.out.print(courses.get(i).getCredit()+"\t\t");
										System.out.println("\n");
							
								}
						        break;		
								
							}
							
							
							case 3 :{
								 System.out.println("Faculty Information ");
								  System.out.println("Faculty ID\t Faculty Name\t Faculty Position");

							        for (int i = 0; i < faculties.size(); i++) {
							        
							        	System.out.print(faculties.get(i).getFacultyId()+"\t\t"); 
										System.out.print(faculties.get(i).getFacultyName()+"\t\t");
										System.out.print(faculties.get(i).getFacultyPosition()+"\t");
										System.out.println("\n");

								}
						        break;		
							}
							case 4 :{
								 System.out.print("Enter Student ID to print information :  ");
							        int studentid = inpScanner.nextInt();   
							        System.out.println("Student ID\t"+"Student Name\t"+"Student CGPA");
							        for (int j = 0; j < students.size(); j++) {
							                if (studentid == students.get(j).getStudentid()) {
							                	System.out.print(students.get(j).getStudentid()+"\t\t");
							                	System.out.print(students.get(j).getStudentname()+"\t\t");
												System.out.print(students.get(j).getStudentCGPA()+"\t");
												System.out.println("\n");
							                }       
								
									}
							        break;
							}
							case 5 :{
								System.out.print("Enter Course ID to print information :  ");
						        String courseid = inpScanner.next();   
						        System.out.println("Course ID\t"+"Course Name\t"+"Course Credit");
						        for (int j = 0; j < courses.size(); j++) {
						                if (courseid == courses.get(j).getCourseId()) {
						                	System.out.print(courses.get(j).getCourseId()+"\t\t");
						                	System.out.print(courses.get(j).getCourseTitle()+"\t\t");
											System.out.print(courses.get(j).getCredit()+"\t");
											System.out.println("\n");
						                	
						                }   
						               
							
								}
						        
							        break;
							}
							case 6 :{
								System.out.print("Enter Faculty ID to print information :  ");
						        int facultyid = inpScanner.nextInt();   
						        System.out.println("Faculty ID\t"+"Faculty Name\t"+"Faculty Position");
						        for (int j = 0; j < faculties.size(); j++) {
						                if (facultyid == faculties.get(j).getFacultyId()) {
						                	System.out.print(faculties.get(j).getFacultyId()+"\t\t");
						                	System.out.print(faculties.get(j).getFacultyName()+"\t\t");
											System.out.print(faculties.get(j).getFacultyPosition()+"\t");
											System.out.println("\n");
						                	
						                }       
							
								}
							        break;
							}
							case 7 :{
								
								 System.out.println("Enter Course ID to print student list and faculty information of a course - ");
							        String  courseid = inpScanner.next();  
				                	Course c = new Course();

							        System.out.println("Student List - ");

							        for (int j = 0; j < courses.size(); j++) {
							                if (courseid==courses.get(j).getCourseId()){
							                	
							                	courses.get(j).printstudentlist();   
							                }
							                
									}
							        
//							        System.out.println("Student List - ");
//							    	c.printstudentlist();
							        
							        System.out.println("Faculty Info - ");
							    	c.getFaculty().facultydisplay();
							    	
							        break;
							}
							case 8 :{
								
								 System.out.println("Enter Student ID to print courses taken by a student - ");
							        int studentid = inpScanner.nextInt();   
							        System.out.println("Courses taken by a student - ");
							        for (int j = 0; j < students.size(); j++) {
							                if (studentid==students.get(j).getStudentid()) {
							                	students.get(j).displaytakenCourses();
							                }       
							                
									}
							        break;
							}
							case 9:{
				                innerExit = true;
				                break;
							}
							default :
								System.out.println("Invaid operation!!!(Choose between 1 to 3)\nProgram exit!");
				                break;
				
							}
					}				
								break;
						
					}
				case 5: {		                    
	                    
	                        boolean innerExit = false;
	    					
							while(!innerExit) {
								System.out.println("1. Search a Student");
		                        System.out.println("2. Search a Course");
		                        System.out.println("3. Seatch a Faculty");
		                        System.out.println("4. Search weather a student takes a course");
		                        System.out.println("5. Search weather a faculty teaches a course");
		                        System.out.println("6. Search courses taken by a student");
		                        System.out.println("7. Search courses taken by a faculty");
								System.out.println("8. Exit! ");

							System.out.println("Choose option - ");
							int searchoption = inpScanner.nextInt();	
								
							
								switch (searchoption) {
								case 1: {
								
								        System.out.println("Enter student id to search");
								        int studentid = inpScanner.nextInt();               
								        for (int j = 0; j < students.size(); j++) {
								                if (studentid == students.get(j).getStudentid()) {
								                   System.out.println(students.get(j).studentdisplay()); 
								                }  
								                else {
													System.out.println("Student is not found");
												}
										        break;

										}
								        break;
								}
								
								
								
								case 2: {
									
							        System.out.println("Enter course id to search");
							        String courseid = inpScanner.next();               
							        for (int j = 0; j < courses.size(); j++) {
							                if (courseid == courses.get(j).getCourseId()) {
							                	System.out.println(courses.get(j).coursedisplay());
							                }  
							                else {
												System.out.println("Course is not found");
											}
									        break;
									}
							        break;

							}
					

								case 3: {
									
							        System.out.println("Enter faculty id to search");
							        int facultyid = inpScanner.nextInt();               
							        for (int j = 0; j < courses.size(); j++) {
							                if (facultyid == faculties.get(j).getFacultyId()) {
							                   System.out.println(faculties.get(j).facultydisplay());							                }  
							                else {
												System.out.println("Faculty is not found");
											}
									        break;

									}
							        break;

							}
								
								case 4: {
									
							        System.out.println("Enter student id to search weather a student takes a course - ");
							        int studentid = inpScanner.nextInt();               
							        for (int j = 0; j < students.size(); j++) {
							                if (studentid == students.get(j).getStudentid()) {
							                	if (students.get(j).getNumberOfcourses()>0) {
													System.out.println("Courses taken "+ students.get(j).getNumberOfcourses());
													students.get(j).displaytakenCourses();
												}
							                	else {
													System.out.println("No course is taken");
												}
							                } 
									        break;
							        }
							        break;

								}	
								
								
														
								case 5: {
											
							        System.out.println("Enter faculty id to search weather a faculty teaches a course - ");
							        int facultyid = inpScanner.nextInt();               
							        for (int j = 0; j < students.size(); j++) {
							        	if (facultyid == faculties.get(j).getFacultyId()) {
			                
							        		System.out.println("Courses taken "+ courses.get(j).getCourseTitle());
							        		}
					                
							        	else {
							        		System.out.println("No course is taken by the faculty");
							        		}
								                
								   break;
							        }
							        break;
   
								}	
														
								case 6: {
									
							        System.out.println("Enter course id to search weather a student takes the course - ");
							        int studentid = inpScanner.nextInt();               
							        for (int j = 0; j < students.size(); j++) {
							                if (studentid == students.get(j).getStudentid()) {
							                if (students.get(j).getNumberOfcourses()>0) {
												System.out.println("Students taken the course - "+ students.get(j).getNumberOfcourses());
												students.get(j).displaytakenCourses();
											}
												}
							                	else {
													System.out.println("Nobody has taken this course!");
												}
									        break;
						       
									}
							        break;

							}	
							
								
								
									case 7: {
								
												System.out.println("Enter course id to search weather a faculty takes the course - ");
												int facultyid = inpScanner.nextInt();               
												for (int j = 0; j < faculties.size(); j++) {
													if (facultyid == faculties.get(j).getFacultyId()) {
														
															System.out.println("This course is taken by the faculty - "+ faculties.get(j).getFacultyName());
														
													}
													else {
														System.out.println("No faculty has taken this course!");
													}
											        break;
						
												}
										        break;

										}
							case 8:
			                    innerExit = true;
			                    break;
			
							
							default :
								System.out.println("Invaid operation!!!(Choose between 1 to 7)\nProgram exit!");
								break;						
								
							}	
					}					
							break;
			}	
		
					case 6:
						exit = true;
			            break;
					default :{
						System.out.println("Invaid operation!!!(Choose between 1 to 6)\nProgram exit!");
					}
							
				}
					if (!exit) {
		            }	
					  System.out.println("Goodbye!");
			}
		
	}
}