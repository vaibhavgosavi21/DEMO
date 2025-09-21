package ShoopingApplication3;

import java.util.List;

public class Customer {
	private int custId;
	private String custName;
	private int mobNumber;
	
	private Address addr;
	private List<Product> lstproduct;
	public Customer(int custId, String custName, int mobNumber, Address addr, List<Product> lstproduct) {
		
		this.custId = custId;
		this.custName = custName;
		this.mobNumber = mobNumber;
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
	public int getMobNumber() {
		return mobNumber;
	}
	public void setMobNumber(int mobNumber) {
		this.mobNumber = mobNumber;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public List<Product> getLstproduct() {
		return lstproduct;
	}
	public void setLstproduct(List<Product> lstproduct) {
		this.lstproduct = lstproduct;
	}
	
	
	
	
	
}
