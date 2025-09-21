package IfElse;

import java.util.Scanner;

public class LeapYear {
	
//	A year is a leap year if:
//		It is divisible by 4 and not divisible by 100, OR
//		It is divisible by 400
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year:");
		int year=sc.nextInt();
		
		if((year%4==0 && year%100!=0)||(year%400==0)){
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not Leap Year");
		}
	}

}
