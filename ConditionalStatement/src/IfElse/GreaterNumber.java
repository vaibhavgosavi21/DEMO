package IfElse;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		if(num1>num2) {
			System.out.println("Number 1 is Greater !");
		}
		else {
			System.out.println("Number 2 is Greater !");
		}
	}

}
