package BankApplication;

import java.util.Scanner;

public class BankManager {

		public Account accpet() {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Account Number: ");
			int accNumber=sc.nextInt();
			
			System.out.println("enter Customer name: ");
			String custName=sc.next();
			
			System.out.println("Enter Account Balance: ");
			double accBal=sc.nextDouble();

			Account obj=new Account(accNumber,custName,accBal);
			return obj;
			
		}
		
		public void display(Account obj) {
			System.out.println("Account No:"+obj.getAccNumber());
			System.out.println("Customer Name: "+obj.getCustName());
			System.out.println("Account Balance: "+obj.getCcBal());
		}
}
