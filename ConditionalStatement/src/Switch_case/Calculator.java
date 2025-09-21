package Switch_case;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\n1-Addition \n2-Substraction \n3-Multiplication \n4-Division");
		int ch=sc.nextInt();
		
		switch (ch) {
		case 1 : {
				System.out.println("Enter two number: ");
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println("Sum:"+(a+b));
				break;
			}
		case 2:{
			System.out.println("Enter two number: ");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Substraction:"+(a-b));
			break;
		}
		case 3:{
			System.out.println("Enter two number: ");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Multiplication:"+(a*b));
			break;
		}
		case 4: {
			System.out.println("Enter two number: ");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Division:"+(a/b));
		}
		default:
			System.out.println("Invalid Choice");
		}

	}

}
