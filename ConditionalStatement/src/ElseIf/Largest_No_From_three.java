package ElseIf;

import java.util.Scanner;

public class Largest_No_From_three {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Three Numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("Number "+num1+" is Greater ");
		}
		else if(num2>num1 && num2>num3) {
			System.out.println("Number "+num2+" is Greater ");
		}
		else {
			System.out.println("Number "+num3+" is Greater ");

		}
	}

}
