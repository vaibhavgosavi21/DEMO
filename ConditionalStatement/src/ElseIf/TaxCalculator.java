package ElseIf;

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Income:");
		int income=sc.nextInt();
		int tax;
		
		if(income<500000) {
			tax=(int)(income*0);
		}
		else if(income>500000 && income<1000000) {
			tax=(int)(income*0.2);
			
		}
		else {
			tax=(int)(income*0.3);
			
		}
		System.out.println("Tax is: "+tax);
	}

}
