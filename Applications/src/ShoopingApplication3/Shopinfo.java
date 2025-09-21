package ShoopingApplication3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;
  

public class Shopinfo {
	List<Product> lstproduct=new ArrayList<Product>();
	
	public Customer create() {
		Scanner sc=new Scanner(System.in);
		//Customer
		System.out.println("Enter Customer Id: ");
		int custId=sc.nextInt();
		
		System.out.println("Enter Customer Name: ");
		String custName=sc.next();
		
		System.out.println("Enter Mobile Number: ");
		int mobNumber=sc.nextInt();
		
		//address
		System.out.println("Enter city: ");
		String city=sc.next();
		
		System.out.println("Enter State: ");
		String state=sc.next();
		
		System.out.println("Enter pincode: ");
		int pincode=sc.nextInt();
		
		
		//product  data
		String str=null;
		
		do 
		{
			System.out.println("Enter product Id: ");
			int prodId=sc.nextInt();
			
			System.out.println("Enter product Name: ");
			String prodName=sc.next();
			
			System.out.println("Enter product price: ");
			double prodPrice=sc.nextDouble();
			
			System.out.println("Enter product Qty: ");
			int prodQty=sc.nextInt();
			
			Product prodbj=new Product(prodId, prodName, prodPrice, prodQty);       //produdct addrees creted
			lstproduct.add(prodbj);
			
			System.out.println("Dou u want to add next product press yes/no");
			str=sc.next();
		}while(str.equals("yes"));
		
		Address addr=new Address(city,state,pincode);
		Customer cust=new Customer(custId, custName, mobNumber,addr,lstproduct);
		return cust;
	}
	
	public Bill CalculateBill(Customer custobj) {
		 
		List<Product> lstproduct=custobj.getLstproduct();
		double total=0;
		
		for (Product p:lstproduct){									//for each loop-[/
			total=total+(p.getProdPrice()*p.getProdQty());
			
		}
		double cgst=total*0.06;
		double sgst=total*0.06;
		double finaltotal=total+cgst+sgst;
		
		Bill billobj=new Bill(101,new Date(), total, cgst, sgst, finaltotal);
		 return billobj;
	}
	
	public void display(Customer custobj, Bill billobj) {
		System.out.println("----------------Cutomer Detail-----------------------------");
		System.out.println("Customer Id: "+custobj.getCustId());
		System.out.println("Customer Name: "+custobj.getCustName());
		System.out.println("Customer Mobile: "+custobj.getMobNumber());
		System.out.println("----------------Product List-----------------");
		
		List<Product> lstproduct=custobj.getLstproduct();
		for(Product p:lstproduct) {
			System.out.println(p.getProdId()+"\t"+p.getProdName()+"\t"+p.getProdPrice()+"\t"+p.getProdQty());
		}
		System.out.println("-----------------Address-----------------------------");
		System.out.println("City: "+custobj.getAddr().getCity());
		System.out.println("State: "+custobj.getAddr().getState());
		System.out.println("Pincode: "+custobj.getAddr().getPincode());
		
		System.out.println("---------------------Bill--------------------------");
		System.out.println("Bill number: "+billobj.getBillNumber());
		System.out.println("Bill Date: "+billobj.getDate());
		System.out.println("Bill Total: "+billobj.getTotal());
		System.out.println("Bill CGST: "+billobj.getCgst());
		System.out.println("Bill SGST: "+billobj.getSgst());
		System.out.println("Final Bill: "+billobj.getFinaltotal());
		System.out.println("------------------Thank You--------------------------------");
	}

}
