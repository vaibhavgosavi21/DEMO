package BankApplication;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankManager nobj=new BankManager();
		Account obj=nobj.accpet();
		nobj.display(obj);
		
	}

}
