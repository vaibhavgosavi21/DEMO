package BankAppUsingArray;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		BankInfo binfo=new BankInfo();
		int ch=0,ct=0;
		Account accarr[]=null;
		
		while(true) {
			System.out.println("1-Create Acciount \n2-Display Account \n3-Search Account \n4-Sort Account");
			System.out.println("enter your choice: ");
			ch=sc.nextInt();
					
			switch(ch) {
			case 1:
				//create array for account
				 accarr=binfo.accept();
				 break;
				 
			case 2:
				//display account
				binfo.display(accarr);
				break;
				
			case 3:
				System.out.println("Enter Account Number to search in array");
				int accno=sc.nextInt();
				
				//search account
				boolean b=binfo.searchAccount(accarr, accno);
				if(b) {
					System.out.println("Record Found");
				}
				else {
					System.out.println("Record Not Found");
				}
				break;
				
			case 4:
				binfo.SortAccount(accarr);
//				System.out.println();
			default:
				
			}
		}
		
		
		
		
		
		
	}

}
