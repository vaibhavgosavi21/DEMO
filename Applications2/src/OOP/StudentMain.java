package OOP;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		
		s.setName("Vaibhav");
		s.setAge(22);
		
		System.out.println("Name: "+s.getName());
		System.out.println("Age: "+s.getAge());

	}

}
