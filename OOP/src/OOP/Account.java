package OOP;

import java.util.Scanner;

public class Account {
	
	private int accNumber;
	private String cusName;
	private double accBalance;
	
	public void getAccount() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Account Number: ");
		accNumber=sc.nextInt();
		System.out.println("Enter Customer Name: ");
		cusName=sc.next();
		System.out.println("Enter Account Balance: ");
		accBalance=sc.nextDouble();
	}
	
	public void displayAccount() {
		System.out.println("Account Number: "+accNumber);
		System.out.println("Customer Name: "+cusName);
		System.out.println("Account BalanceL "+accBalance);
	}

}
