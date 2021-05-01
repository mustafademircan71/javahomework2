package homeWork2;

public class Instructor extends User {
	
		private String instructorFirstName;
		private String instructorLastName;
		private String educationName;
		
		public Instructor() {
			
		}
		

		public Instructor(String instructorFirstName, String instructorLastName, String educationName) {
			this();
			this.instructorFirstName = instructorFirstName;
			this.instructorLastName = instructorLastName;
			this.educationName = educationName;
		}



		public String getInstructorFirstName() {
			return instructorFirstName;
		}



		public void setInstructorFirstName(String instructorFirstName) {
			this.instructorFirstName = instructorFirstName;
		}



		public String getInstructorLastName() {
			return instructorLastName;
		}



		public void setInstructorLastName(String instructorLastName) {
			this.instructorLastName = instructorLastName;
		}



		public String getEducationName() {
			return educationName;
		}



		public void setEducationName(String educationName) {
			this.educationName = educationName;
		}



		public Instructor(String educationName) {
			this.educationName = educationName;
		}
}
