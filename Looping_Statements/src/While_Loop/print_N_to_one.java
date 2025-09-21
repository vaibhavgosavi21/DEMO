package While_Loop;

import java.util.Scanner;

public class print_N_to_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter N Number: ");
		int n=sc.nextInt();
		
		while(n>=1) {
			System.out.println(n);
			n--;
		}
	}

}
