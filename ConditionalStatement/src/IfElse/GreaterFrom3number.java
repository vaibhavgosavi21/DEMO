package IfElse;

import java.util.Scanner;

public class GreaterFrom3number {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 Numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("Number 1 is Greater");
		}
		if(num2>num1 && num2>num3) {
			System.out.println("Number 2 is Greater");
		}
		else {
			System.out.println("Number 3 is Greater");
		}

	}

}
