package Hierarchical_Inheritance;

public class CurrentAccount extends BankAccount {
	private int depositAmont;
	private int WithdrawalAmount;
	public CurrentAccount(int depositAmont, int withdrawalAmount,String bankname, String banklocation) {
		super( bankname,  banklocation);
		this.depositAmont = depositAmont;
		WithdrawalAmount = withdrawalAmount;
	}

	public void details() {
		System.out.println("Bank NAme: "+getBankname());
		System.out.println("Bank Location: "+getBanklocation());
		System.out.println("Deposit Amount: "+getDepositAmont());
		System.out.println("Withdrawal Amount: "+getWithdrawalAmount());
		System.out.println("------------------------");
	}
	
	public int getDepositAmont() {
		return depositAmont;
	}
	public void setDepositAmont(int depositAmont) {
		this.depositAmont = depositAmont;
	}
	public int getWithdrawalAmount() {
		return WithdrawalAmount;
	}
	public void setWithdrawalAmount(int withdrawalAmount) {
		WithdrawalAmount = withdrawalAmount;
	}
	
	
	
	

}
