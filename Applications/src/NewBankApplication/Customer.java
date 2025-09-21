package NewBankApplication;

import java.util.List;

import ShoopingApplication3.Address;
import ShoopingApplication3.Product;

public class Customer {
	private int custId;
	private String custName;
	
	private Address addr;
	private List<Account> lstproduct;
	
	public Customer(int custId, String custName, Address addr, List<Account> lstproduct) {
		
		this.custId = custId;
		this.custName = custName;
		this.addr = addr;
		this.lstproduct = lstproduct;
	}
 
	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public List<Account> getLstproduct() {
		return lstproduct;
	}

	public void setLstproduct(List<Account> lstproduct) {
		this.lstproduct = lstproduct;
	}
	
	
	
}
