package ElseIf;

import java.util.Scanner;

public class Temperature_Range {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Temperatute: ");
		int temp=sc.nextInt();
		
		if(temp>=35) {
			System.out.println(temp+" Hot Temperature");
		}
		else if(temp>20) {
			System.out.println(temp+" Warm Temperature");
		}
		else if(temp>=10) {
			System.out.println(temp+" Cool Temperature");
		}
		else {
			System.out.println(temp+" Cold Temperature");

		}
	}

}
