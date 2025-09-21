package StaticMethod;
import static java.lang.System.out;

 class Bank {
	static int bankno;
	int custid;
	float accbal;
	
	static {
		out.println("Static block.....");
	}
	{
		out.println("default block.......");
	}
	
	public Bank() {
		out.println("Hello constructor....");
	}
	
	public void display() {
		out.println("Bank Number: "+bankno);
		out.println("Customer id: "+custid);
		out.println("Bank Bal: "+accbal);
	}
	
	public static void show() {
		Bank btempobj1=new Bank();
//		out.println("Bank No is : "+bankno);
		btempobj1.bankno=7588;
		btempobj1.custid=999;
		btempobj1.accbal=1000;
		out.println("Bank number: "+btempobj1.bankno);
		out.println("Customer id is: "+btempobj1.custid);
		out.println("Bank Bal: "+btempobj1.accbal);
		
	}

}	
 	
	public class StaticConcepts{
		public static void test() {
			System.out.println("Hello.test");
		}
		public static void main(String[]args) {
			test();
			Bank.show();
			
			Bank bankobj1=new Bank();
			bankobj1.bankno=101;
			bankobj1.custid=1;
			bankobj1.accbal=2000;
			bankobj1.display();
			
			Bank bankobj2=new Bank();
			bankobj2.bankno=102;
			bankobj2.custid=2;
			bankobj2.accbal=4000;
			bankobj2.display();
		}
		
		
}
	
