package BasicArray;

import java.util.Scanner;

public class Array4_input {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int array[]=new int[6];
		int i;
		System.out.println("Enter values for array: ");
		for( i=0; i<array.length; i++) {
		array[i]=sc.nextInt();
		}
		
		System.out.println(array[i]);
	}
	


}
