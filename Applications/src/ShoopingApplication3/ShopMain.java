package ShoopingApplication3;

public class ShopMain {

	public static void main(String[] args) {
		
		Shopinfo sinfo=new Shopinfo();
		Customer custobj=sinfo.create();
		Bill billobj=sinfo.CalculateBill(custobj);
		sinfo.display(custobj, billobj);
	}

}
