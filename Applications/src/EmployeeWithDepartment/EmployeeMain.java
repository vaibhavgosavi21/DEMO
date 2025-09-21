package EmployeeWithDepartment;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			
			Employee emp=new Employee(101,"Vaibhav",60000,"Developer");
//			System.out.println("Enter Employee Id: ");
//			int n=sc.nextInt();
//			
//			Employee[] emp=new Employee[n];
//			for(int i=0; i<n; i++) {
//				System.out.println("Enter Employee Id: ");
//				int empId=sc.nextInt();
//				
//				System.out.println("Enter Emp Name:");
//				String empName=sc.next();
//				
//				System.out.println("Enter Salary:");
//				double empSal=sc.nextDouble();
//				
//				System.out.println("Enter Emp Designatipon: ");
//				String desg=sc.next();
//				
////				Employee emp=new Employee( empId,  empName,  empSal,  desg);
//			}
			
			Project probj=new Project(121,"Software Application",12/12/2,2);
			
			Address addrobj=new Address("Pune","Maharshtra",414234);
			
			Department depobj=new Department(901,"Development","JM Road");
			
			
			System.out.println("-------Department details-------");
			System.out.println("DeptId: "+depobj.getDeptd());
			System.out.println("Dept Name: "+depobj.getdName());
			System.out.println("Salary : "+depobj.getdLoc());
			
			System.out.println("----------Project Details---------");
			System.out.println("Project Details: "+probj.getProId());
			System.out.println("Name: "+probj.getProName());
			System.out.println("Start Date: "+probj.getStartdate());
			System.out.println("Duration: "+probj.getDuration());
			
			System.out.println("--------------Employee----------");
			System.out.println("Employee Id:"+emp.getEmpId());
			System.out.println("Employee Name:"+emp.getEmpName());
			System.out.println("Employee Salary:"+emp.getEmpSal());
			System.out.println("Designation: "+emp.getDesg());
			
			System.out.println("----------Address------");
			System.out.println("City: "+addrobj.getCity());
			System.out.println("State: "+addrobj.getState());
			System.out.println("Pincode: "+addrobj.getPincode());
			
			
			
			
			
			
			
	}

}
