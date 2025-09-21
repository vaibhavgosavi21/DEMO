package OOP;

import java.util.Scanner;

public class Account2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		Account2 obj=new Account2();
		obj.setAccNumber(98957785);
		obj.setCustomerName("Vaibhav");
		obj.setAccountBalance(50000);
		
		
		System.out.println("Account No:"+obj.getAccNumber());
		System.out.println("Customer Nmae: "+obj.getCustmerName());
		System.out.println("Account Balance: "+obj.setAccountBalance());

	}

}
 