package While_Loop;

import java.util.Scanner;

public class Print_N_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A Number: ");
		int range=sc.nextInt();
		int counter=1;
		
		while(counter<=range) {
			System.out.println(counter);
			counter++;
		}
	}

}
