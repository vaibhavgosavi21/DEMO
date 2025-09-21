package EmployeeUsingArray;

import java.util.Scanner;

import BankAppUsingArray.Account;

public class EmpInfo {

	public Employee[] accept() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many employee account u want: ");
		int n=sc.nextInt();
		
		Employee emparr[]=new Employee[n];    //array of Employee object
		System.out.println("Enter Account Details");
		
		for(int i=0; i<emparr.length; i++) {
			
			System.out.println("Enter Employee Id:");
			int empId=sc.nextInt();
			
			System.out.println("Enter Employee Name:");
			String empName=sc.next();
			
			System.out.println("Enter Salary:");
			double empSal=sc.nextDouble();
			
			emparr[i]=new Employee(empId, empName, empSal);
		}
		return emparr;
	}
	
	
	public void display(Employee emparr[]) {
		System.out.println("__________________");
		for(int i=0; i<emparr.length; i++) {
			
			System.out.println("________________");
			System.out.println(emparr[i].getEmpId()+"\t"+emparr[i].getEmpName()+"\t"+emparr[i].getEmpSal());
		}
	}
	public boolean searchEmployee(Employee emparr[], int empId) {
		
		boolean b=false;
		for(int i=0; i<emparr.length; i++) {
		if(emparr[i].getEmpId()==empId) {
			b=true;
		break;
			}
		}
		return b;
}
}
