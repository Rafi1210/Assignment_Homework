package association_inheritance;
//inheritance main

public class Faculty {

	private int facultyId;
	private String facultyName;
	private String facultyPosition;
	
	Faculty() {	
	}
	
	Faculty(int facultyId, String facultyName, String facultyPosition) {
		this.facultyId=facultyId;
		this.facultyName=facultyName;
		this.facultyPosition=facultyPosition;
		
	}
	
	public int getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public String getFacultyPosition() {
		return facultyPosition;
	}
	public void setFacultyPosition(String facultyPosition) {
		this.facultyPosition = facultyPosition;
	}
	
	public String facultydisplay()
    {
		return "FacultyId : "+facultyId+" FacultyName : "+facultyName +" FacultyPosition : "+facultyPosition ;			
	}
	
}


