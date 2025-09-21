package Switch_case;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int n=sc.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("one");
			break;
		
		case 2:
			System.out.println("two");
			break;
			
		case 10:
			System.out.println("ten");
			break;
			
		default:
			System.out.println("none");
		}
	}

}
