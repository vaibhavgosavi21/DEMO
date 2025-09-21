package ATM;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ATMIMP account=new ATMIMP(1000, "1234");
		
		ATM atm=account;
		System.out.println("Welcome to ATM");
		while (true) {
			System.out.println("1. Withdraw \n2. Deposit \n3. Checkbalance \n4. Exit");
			System.out.println("Enter your choice: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1->{
				System.out.println("Enter a amount to withdraw: ");
				double amount=sc.nextDouble();
				System.out.println("Enter your 4 digit pin: ");
				String pin=sc.next();
				atm.withdraw(amount, pin);
				System.out.println();
				
			}
			
			case 2->{
				System.out.println("Enter amount to deposit:");
				double amount=sc.nextDouble();
				System.out.println("Enter your 4 digit pin:");
				String pin=sc.next();
				
				atm.deposit(amount,pin);
			}
			
			case 3->{
				System.out.println("Current Balance: ");
				account.checkBalance();
				
			}
			}
			
		}

	}

}
