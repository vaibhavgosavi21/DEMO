package ShopApp2;

import java.util.Date;
import java.util.Scanner;

public class ShopMain {

    public static void main(String[] args) {
        
    	Customer cust=billinfo.create();
    	
    	Bill bill=billinfo.calculateBill(cust);
    	
    	billinfo.display(cust, bill);
    	
    	
    }
    
    
}
