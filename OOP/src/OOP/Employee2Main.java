package OOP;

public class Employee2Main {

	public static void main(String[] args) {

		Employee2 obj1=new Employee2();         //Default Constructor
		Employee2 obj2=new Employee2(101,"Vaibhav",60000);      //Parameterized constructor
		Employee2 obj3=new Employee2(obj2);    //Copy constructor
		
		display(obj1);
		display(obj2);
		display(obj3);
		
	}
	public static void display(Employee2 obj) {

		System.out.println("ID: "+obj.getEmpId());
		System.out.println("Name: "+obj.geteName());
		System.out.println("Salary: "+obj.geteSalary());
	}
}
