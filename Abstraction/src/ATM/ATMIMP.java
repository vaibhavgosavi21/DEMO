package ATM;

public class ATMIMP extends ATM {

	private double balance;
	private String password;

	public ATMIMP(double b, String pin) {
		this.balance=b;
		this.password=pin;
	}

	@Override
	void withdraw(double amount, String pin) {
		if(pin.equals(this.password)) {
			if(amount<this.balance) {
				System.out.println("Withdrawing "+amount+"$.........");
				this.balance-=amount;
				checkBalance();
				return;
			}
			System.out.println("Insufficient Balance.....");
			return ;
			
		}
		System.out.println("Incorrect Password...Please try again");
		
	}

	@Override
	void deposit(double amount, String pin) {

		if(pin.equals(this.password)) {
			System.out.println("Deposit $:"+amount);
			this.balance+=amount;
			checkBalance();
		}
		
		
	}

	@Override
	void checkBalance() {
		System.out.println("Total Balance: $"+this.balance);
		
	}

	
}
