package IfElse;

import java.util.Scanner;

public class Studentmarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks for Java: ");
		int java=sc.nextInt();
		
		System.out.println("Enter Marks of Python: ");
		int py=sc.nextInt();
		
		System.out.println("Enter Marks of JavaScript: ");
		int js=sc.nextInt();
		
		System.out.println("Enter Marks of C: ");
		int c=sc.nextInt();
		
		int total=java+py+js+c;
		
		if(total>=90) {
			System.out.println("Grade A");
		}
		if(total>=80 && total<=89) {
			System.out.println("Grade B");
		}
		if(total>=70 && total<=79) {
			System.out.println("Grade C");
		}
		if(total>=60 && total<=69) {
			System.out.println("Grade D");
		}
	}

}
