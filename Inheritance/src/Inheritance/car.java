package Inheritance;

public class car extends Vehicle {       //child extend parent
	String carname;
	String fueltype;
	
	public void detailsofcar() {
		System.out.println("CAR NAME: "+carname);
		System.out.println("Fuel Type: "+fueltype);
		
	}
	

}
