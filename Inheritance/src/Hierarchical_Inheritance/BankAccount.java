package Hierarchical_Inheritance;

public class BankAccount {
	private String bankname;
	private String banklocation;
	
	public BankAccount(String bankname, String banklocation) {
		super();
		this.bankname = bankname;
		this.banklocation = banklocation;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getBanklocation() {
		return banklocation;
	}

	public void setBanklocation(String banklocation) {
		this.banklocation = banklocation;
	}
	
	
	
	

}
