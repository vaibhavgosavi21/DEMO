package BankAppUsingArray;

import java.util.Scanner;

public class BankInfo {
	public Account[] accept() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many Account do u want:");
		int n=sc.nextInt();
		
		Account accarr[]=new Account[n];      //array of account class //array of object
		System.out.println("Enter Account Details");
		
		for(int i=0; i<accarr.length; i++) {
			
			System.out.println("Enter Account Number:");
			int accNumber=sc.nextInt();
			
			System.out.println("Enter customer name");
			String custName=sc.next();
			
			System.out.println("Enter Account Balance:");
			double accBal=sc.nextDouble();
			
			accarr[i]=new Account(accNumber, custName, accBal);
		}
		return accarr;
	}
	
	public void display(Account accarr[]) {
		System.out.println("-------------------------");
		for(int i=0; i<accarr.length; i++) {
			
			System.out.println("--------------------");
			System.out.println(accarr[i].getAccNumber()+"\t"+accarr[i].getCustName()+"\t"+accarr[i].getAccBal());
			
			}
		}
	
	public boolean searchAccount(Account accarr[], int accno) {
		
		boolean b=false;
		for(int i=0; i<accarr.length; i++) {
		if(accarr[i].getAccNumber()==accno) {
			b=true;
		break;
			}
		}
		return b;
    }
	
	public void SortAccount(Account accarr[]) {
		for(int i=0; i<accarr.length; i++) {
			for(int j=i+1; j<accarr.length; j++) {
				Account temp=accarr[i];
				accarr[i]=accarr[j];
				accarr[j]=temp;
			}
		}
		System.out.println("Sorting done");
		
	}
}
