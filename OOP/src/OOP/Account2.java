package OOP;

public class Account2 {
	private int accNo;
	private String cusName;
	private double accBalance;
	
	public void setAccNumber(int accNo) {
		this.accNo=accNo;
	}
	public int getAccNumber() {
		return accNo;
	}
	
	public void setCustomerName(String cusName) {
		this.cusName=cusName;
	}
	public String getCustmerName() {
		return cusName;
	}
	
	public void setAccountBalance(double accBalance) {
		this.accBalance=accBalance;
	}
	public double setAccountBalance() {
		return accBalance;
	}
}
