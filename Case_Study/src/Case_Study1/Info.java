package Case_Study1;

public class Info {
		public void display(Student student) {
			System.out.println("Student Id: "+student.getId());
			System.out.println("Student Name: "+student.getName());
			System.out.println("Student Date of Birth: "+student.getDateofbirth());
		}
		
		public void display(Course course) {
			System.out.println("Course Id: "+course.getCourseId());
			System.out.println("Course Name: "+course.getCourseName());
			System.out.println("Course Duration: "+course.getDuration());
			System.out.println("Course Fees: "+course.getFees());
		}
}
