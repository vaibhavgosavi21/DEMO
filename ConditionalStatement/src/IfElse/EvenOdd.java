package IfElse;

import java.util.Scanner;

public class EvenOdd {

	//Even Number: 2,4,6,8,10,...
	//Odd Number: 1,3,5,7,9,.....
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out .println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}

}
