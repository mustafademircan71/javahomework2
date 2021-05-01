package homeWork2;

public class Main {

	public static void main(String[] args) {
	
		
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setUserName("engin_demirog");
		instructor.setInstructorFirstName("Engin");
		instructor.setInstructorLastName("Demiroğ");
		instructor.setEducationName("Java Eğitim Kampı");
		
		Student student=new Student(); 			
		student.setId(1);
		student.setUserName("mustafa_demircan");
		student.setStudentFirstName("Mustafa");
		student.setStudentLastName("Demircan");
		student.setStudentNumber("1364");
		
		UserManager userManager=new UserManager();
		
		User[] users= {instructor,student};
		userManager.addMultiple(users);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor);
		
		StudentManager studentManager=new StudentManager();
		studentManager.logIn(student);
		
	}

}
