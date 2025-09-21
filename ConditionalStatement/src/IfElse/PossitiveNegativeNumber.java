package IfElse;

import java.util.Scanner;

public class PossitiveNegativeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		if(num>=0) {
			System.out.println("Possitive Number");
		}
		else {
			System.out.println("Negative Number");
		}

	}

}
