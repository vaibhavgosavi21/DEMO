package EmployeeWithDepartment;

public class Address {

	private String city;
	private String State;
	private int pincode;
	public Address(String city, String state, int pincode) {
		super();
		this.city = city;
		State = state;
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	
	
}
