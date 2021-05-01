package homeWork2;

public class Student extends User {
	private String studentFirstName;
	private String studentLastName;
	private	String studentNumber;
	
	public Student() {
		
	}

	public Student(String studentFirstName, String studentLastName, String studentNumber) {
		this();
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentNumber = studentNumber;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
}
