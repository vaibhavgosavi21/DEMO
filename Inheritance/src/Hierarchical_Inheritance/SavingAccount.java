package Hierarchical_Inheritance;

public class SavingAccount extends BankAccount {
	private int interestrate;
	private int amount;
	
	
	public SavingAccount(int interestrate, int amount,String bankname, String banklocation) {
		super( bankname,  banklocation);
		this.interestrate = interestrate;
		this.amount = amount;
	}
	
	public void details() {
		System.out.println("Bank NAme: "+getBankname());
		System.out.println("Bank Location: "+getBanklocation());
		System.out.println("Interest Rate: "+getInterestrate());
		System.out.println("Saving Amount: "+getAmount());
	}
	
	public void detailofsaving() {
		System.out.println("Interest rate: ");
		System.out.println("Saving Amount: ");
	}

	public int getInterestrate() {
		return interestrate;
	}

	public void setInterestrate(int interestrate) {
		this.interestrate = interestrate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
	
	

}
