package Multiple_inheritance;

public class Water implements Hot_water, Cold_water {
	
	int temperature;

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public Water(int temperature) {
		super();
		this.temperature = temperature;
	}

	@Override
	public void cold() {
		if(temperature<10) {
		System.out.println("Temperature is "+this.temperature+" So this is Cold water");
		}
//		else {
//			System.out.println("Not Cold ");
//		}
		
		
	}

	@Override
	public void hot() {
		if(temperature>10) {
		System.out.println("Temperature is "+this.temperature+" So this is hot water");		
		}
//		else {
//			System.out.println("Not Hot");
//		}
	}


}
