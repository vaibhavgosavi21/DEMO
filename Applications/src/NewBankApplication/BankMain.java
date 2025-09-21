package NewBankApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== Address Input =====
        System.out.print("Enter City: ");
        String city = sc.nextLine();
        System.out.print("Enter State: ");
        String state = sc.nextLine();
        System.out.print("Enter Pincode: ");
        int pincode = sc.nextInt();
        sc.nextLine(); // consume newline

        Address address = new Address(city, state, pincode);

        // ===== Customer Input =====
        System.out.print("Enter Customer ID: ");
        int custId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Customer Name: ");
        String custName = sc.nextLine();

        // ===== Account Input =====
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account Type (Savings/Current): ");
        String accType = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        Account account = new Account(accNo, accType, balance);

        List<Account> accounts = new ArrayList<>();
        accounts.add(account);

       Customer customer = new Customer(custId, custName, address, accounts);

        // ===== Transaction Menu =====
        Transaction trans = new Transaction();

        while (true) {
            System.out.println("\n==== BANK MENU ====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Account Details");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    trans.deposit(account);
                    break;
                case 2:
                    trans.withdraw(account);
                    break;
                case 3:
                    System.out.println("\nCustomer ID: " + customer.getCustId());
                    System.out.println("Customer Name: " + customer.getCustName());
                    System.out.println("City: " + customer.getAddr().getCity());
                    System.out.println("State: " + customer.getAddr().getState());
                    System.out.println("Pincode: " + customer.getAddr().getPincode());
                    System.out.println("Account Number: " + account.getAccNo());
                    System.out.println("Account Type: " + account.getAccType());
                    System.out.println("Account Balance: ₹" + account.getAccBal());
                    break;
                case 4:
                    System.out.println("Thank you for using the bank application!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
