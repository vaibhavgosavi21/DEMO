package OOP;

import java.util.Scanner;

public class Product {
	
        private int proid;
        private String proName;
        private double proprice;
        private int proqty;
        
        
        public void accept() {
        	Scanner sc=new Scanner(System.in);
        	
        	System.out.println("Enter Product Id: ");
        	proid=sc.nextInt();
        	System.out.println("Enter Product Name: ");
        	proName=sc.next();
        	System.out.println("Enter Product Price: ");
        	proprice=sc.nextDouble();
        	System.out.println("Enter Product Quantity: ");
        	proqty=sc.nextInt();		
        }
        
        public void calculate() {
        	double total;
        	 total=proprice*proqty;
        	double cgst=total*0.05f;
        	double sgst=total*0.05f;
        	double finalTotal=total+cgst+sgst;
        	
        	System.out.println("Total price: "+total);
        	System.out.println("CGST: "+cgst);
        	System.out.println("SGST: "+sgst);
        	System.out.println("Final Ammount: "+finalTotal);
        }
        
        public void display() {
        	
        	
        	System.out.println("*******************************");
        	System.out.println("Product Id: "+proqty);
        	System.out.println("Produdt Price: "+proprice);
        	System.out.println("Product QTY: "+proqty);
        	
        	
        	
        }

}
