package OOP;

import java.util.Scanner;

class Welcome{
	private  int empid;
	private String empname;
	private double empsalary;
	
	
	public void accept(){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Employee Id: ");
		empid=sc.nextInt();
		System.out.println("Enter Employee Name: ");
		empname=sc.next();
		System.out.println("Enter Employee Salary: ");
		empsalary=sc.nextDouble();
	}
	
	public void display() {
		System.out.println("Employee Id:"+empid);
		System.out.println("Employee Name:"+empname);
		System.out.println("Employee Salary:"+empsalary);
		
	}
	
}



//public class WelcomeMain{
//
//	public static void main(String[] args) {
//
//		Employee eobj=new Employee();
//		eobj.accept();
//		eobj.display();
//		
//	}
//
//}
