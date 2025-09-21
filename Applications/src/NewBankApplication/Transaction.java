package NewBankApplication;

import java.util.Scanner;

public class Transaction {

    Scanner sc = new Scanner(System.in);

    // Withdraw money
    public void withdraw(Account account) {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount > 0 && amount <= account.getAccBal()) {
            account.setAccBal(account.getAccBal() - amount);
            System.out.println("₹" + amount + " withdrawn successfully!");
            System.out.println("Remaining Balance: ₹" + account.getAccBal());
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    // Deposit money
    public void deposit(Account account) {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        if (amount > 0) {
            account.setAccBal(account.getAccBal() + amount);
            System.out.println("₹" + amount + " deposited successfully!");
            System.out.println("New Balance: ₹" + account.getAccBal());
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
}
