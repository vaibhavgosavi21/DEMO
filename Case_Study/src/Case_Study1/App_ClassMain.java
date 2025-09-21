package Case_Study1;
import java.util.Date;
import java.util.Scanner;
//class App{
//	public  void scenario1() {
//		Info i=new Info();
//		Student s1=new Student(1,"Vaibhav",new Date());
//		Student s2=new Student(2,"Sham",new Date());
//		
//		i.display(s1);
//		i.display(s2);
//	}
//	
//	public void scenario2() {
//		Student[] sarr=new Student[3];
//		Info i=new Info();
//
//		sarr[0]=new Student(1,"vg",new Date());
//		sarr[1]=new Student(2,"NS",new Date());
//		sarr[2]=new Student(3,"AA",new Date());
////		i.display();r
//		i.display(sarr[0]);
//		i.display(sarr[1]);
//		i.display(sarr[2]);
//	}
//	
//	public void scenario() {
//				
//	}
//	
//}

class App {

    // Scenario 1: Hard-coded objects
    public void scenario1() {
        Info i = new Info();
        Student s1 = new Student(1, "Vaibhav", new Date("2003/12/09"));
        Student s2 = new Student(2, "Sham", new Date("2003/11/12"));

        i.display(s1);
        i.display(s2);
    }

    // Scenario 2: Array of students
    public void scenario2() {
        Student[] sarr = new Student[3];
        Info i = new Info();

        sarr[0] = new Student(1, "VG", new Date());
        sarr[1] = new Student(2, "NS", new Date());
        sarr[2] = new Student(3, "AA", new Date());

        for (Student s : sarr) {
            i.display(s);
        }
    }

    // Scenario 3: Input from user
    public void scenario3() {
        Scanner sc = new Scanner(System.in);
        Info i = new Info();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Student[] students = new Student[n];

        for (int idx = 0; idx < n; idx++) {
            System.out.println("Enter details for student " + (idx + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            // Using current date for now; could add proper date parsing later
            students[idx] = new Student(id, name, new Date());
        }

        System.out.println("\n--- Displaying Entered Students ---");
        for (Student s : students) {
            i.display(s);
        }
    }
}


public class App_ClassMain {

	public static void main(String[] args) {
		
//		Info i=new Info();
////		Student student=new Student();
//		App a=new App();
//		
//		a.scenario1();
//		a.scenario2();
		
		App a = new App();

        System.out.println("\n=== Scenario 1 ===");
        a.scenario1();

        System.out.println("\n=== Scenario 2 ===");
        a.scenario2();

        System.out.println("\n=== Scenario 3 ===");
        a.scenario3();
    
		
		
		
	}

}
