package IfElse;

import java.util.Scanner;

public class CharacterCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch=sc.next().charAt(0);
		
		if(ch>='A' && ch<='Z') {
			System.out.println("Upper Case");
		}
		else {
			System.out.println("Lower Case");
		}
	}

}
