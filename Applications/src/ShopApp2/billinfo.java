package ShopApp2;

import java.util.Date;

public class billinfo {
	//Customer custobj=create();
	
	public 	static Customer create() {
		Product probj1=new Product(101,"Laptop",20000,1);
    	Product probj2=new Product(102,"Mobile",15000,3);
    	Product probj3=new Product(103,"Book",2000,2);

        Product prodarr[]=new Product[3];
        prodarr[0]=probj1;
        prodarr[1]=probj2;
        prodarr[2]=probj3;
        
        Address addr=new Address("Pune","Maharashtra",414123);
        Customer custobj=new Customer(1,"Vaibhav","235545342",addr,prodarr);
        
        Bill billobj=calculateBill(custobj);
        
        //display(custobj,billobj);
        return custobj;
	}
		
	public static Bill calculateBill(Customer cust) {
    	Product prodarr[]=cust.getProd();
    	int billNo=101;
    	double total=0;
    	double cgst=0;
    	double sgst=0;
    	double finaltotal=0;
    	
    	for(Product pobj:prodarr) {
    		total=total+(pobj.getProPrice()*pobj.getProQty());  //100*2=200+(300*3=900)=1100+(500*2=1000)=2100
    	}
    	cgst=total*0.06;
    	sgst=total*0.06;
    	finaltotal=total+cgst+sgst;
    	Date date=new Date();
    	
    	//create Object of Bill Class
    	Bill billobj=new Bill(billNo, total, cgst, sgst, finaltotal, date);
    	return billobj;
    	
    }
    
    public static void  display(Customer cust, Bill billobj ) {
    	System.out.println("Customer Id: "+cust.getCustId());
    	System.out.println("Customer Name: "+cust.getCustName());
    	System.out.println("Cutomer Mob No:"+cust.getMobNo());
    	System.out.println("---------------Address----------");
    	Address address=cust.getAddr();
    	System.out.println("City: "+address.getCity());
    	System.out.println("State: "+address.getState());
    	System.out.println("Pincode: "+address.getPincode());
    	
    	
    	
    	System.out.println("-----------Product Details-------");
    	Product prodarr[]=cust.getProd();
    	
    	for(int i=0; i<prodarr.length; i++) {
        	System.out.println("Product Id: "+prodarr[i].getProId());
        	System.out.println("Product Name: "+prodarr[i].getProName());
        	System.out.println("Product Price: "+prodarr[i].getProPrice());
        	System.out.println("Product Qty: "+prodarr[i].getProQty());

    	}
    	
    	System.out.println("-------------Bill--------------");
    	System.out.println("Bill No:  "+billobj.getBillno());
    	System.out.println("Bill Date: "+billobj.getBilldate());
    	System.out.println("Bill Total: "+billobj.getBilltotal());
    	System.out.println("CGST: "+billobj.getCgst());
    	System.out.println("SGST: "+billobj.getSgst());
    	System.out.println("Final Total: "+billobj.getFinaltotal());
    	System.out.println("--------It Done Do Not Visit Again-----");
    }
}
