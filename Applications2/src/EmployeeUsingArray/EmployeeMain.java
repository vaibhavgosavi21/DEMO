package EmployeeUsingArray;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		
		EmpInfo eInfo=new EmpInfo();
		
		//create array for Employee
		Employee emparr[]=eInfo.accept();
		
		//display Employee
		eInfo.display(emparr);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id to search:");
		int empId=sc.nextInt();
		
		//search Employee
		boolean b=eInfo.searchEmployee(emparr, empId);
		if(b) {
			System.out.println("Record found");
		}
		else {
			System.out.println("Record Not Found");
		}
		
		

	}

}
