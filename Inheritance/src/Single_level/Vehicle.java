package Single_level;

public class Vehicle {
	private int noofwheels;
	private String fueltype;
	public Vehicle(int noofwheels, String type) {
		super();
		this.noofwheels = noofwheels;
		this.fueltype = type;
	}
	public int getNoofwheels() {
		return noofwheels;
	}
	public void setNoofwheels(int noofwheels) {
		this.noofwheels = noofwheels;
	}
	public String getType() {
		return fueltype;
	}
	public void setType(String type) {
		this.fueltype = type;
	}
	
	

}
