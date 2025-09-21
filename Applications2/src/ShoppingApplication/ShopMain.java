package ShoppingApplication;

import java.util.Scanner;

public class ShopMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        Customer[] customers = new Customer[n];          //Customer array

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Customer " + (i + 1));

            // Product Input
            System.out.print("Enter Product ID: ");
            int pid = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Product Name: ");
            String pname = sc.nextLine();
            System.out.print("Enter Product Price: ");
            double price = sc.nextDouble();
            System.out.print("Enter Product Quantity: ");
            int qty = sc.nextInt();
            sc.nextLine();
            Product product = new Product(pid, pname, price, qty);

            // Address Input
            System.out.print("Enter City: ");
            String city = sc.nextLine();
            System.out.print("Enter State: ");
            String state = sc.nextLine();
            System.out.print("Enter Pincode: ");
            int pincode = sc.nextInt();
            sc.nextLine();
            Address address = new Address(city, state, pincode);

            // Customer Input
            System.out.print("Enter Customer ID: ");
            int cid = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Customer Name: ");
            String cname = sc.nextLine();
            System.out.print("Enter Mobile Number: ");
            String mob = sc.nextLine();

            // Create Customer Object
            customers[i] = new Customer(cid, cname, mob, address, product);
        }

        // Display All Customers
        System.out.println("\n=========== Customer Records ===========");
        for (Customer c : customers) {
            display(c);
            System.out.println("----------------------------------------");
        }

        sc.close();
    }

    public static void display(Customer cust) {
        System.out.println("Customer Id: " + cust.getCustId());
        System.out.println("Customer Name: " + cust.getCustName());
        System.out.println("Mobile No: " + cust.getMobNo());

        Address addr = cust.getAddr();
        System.out.println("City: " + addr.getCity());
        System.out.println("State: " + addr.getState());
        System.out.println("Pincode: " + addr.getPincode());

        Product prod = cust.getProd();
        System.out.println("Product Id: " + prod.getProId());
        System.out.println("Product Name: " + prod.getProName());
        System.out.println("Product Price: " + prod.getProPrice());
        System.out.println("Product Quantity: " + prod.getProQty());
    }
}
