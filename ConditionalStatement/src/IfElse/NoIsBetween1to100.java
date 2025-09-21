package IfElse;

import java.util.Scanner;

public class NoIsBetween1to100 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		
		if(n>=1 && n<=100) {
			System.out.println("Number is in range 1 to 100");
		}
		else {
			System.out.println("Number is not in range");
		}

	}

}
