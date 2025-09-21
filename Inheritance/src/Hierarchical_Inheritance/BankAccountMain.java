package Hierarchical_Inheritance;

public class BankAccountMain {

	public static void main(String[] args) {

		CurrentAccount c=new CurrentAccount(6000,2000,"SBI","Pune");
		SavingAccount s=new SavingAccount(5,10000,"ICICI","Pune");
		
		c.details();
		s.details();
	}

}
