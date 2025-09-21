package Interface_Parking;

public class ParkArea implements Parking {
	int parkedvehicle=5 ;
	int totalsize=10;


	public ParkArea(int parkedvehicle, int totalsize) {
		super();
		this.parkedvehicle = parkedvehicle;
		this.totalsize = totalsize;
	}

	@Override
	public void entry() {
		System.out.println();
		if(parkedvehicle < totalsize) {
			System.out.println(" Parking is available, Now you can park");
			
		}
		else {
		System.out.println("Parking is not available");
		}
		
		
	}
	
	@Override
	public void availability() {
		System.out.println("Available parking is: "+(totalsize-parkedvehicle));		
	}

	@Override
	public void exit() {
		System.out.println("vehicle is exited");
		
		
		
	}

	

}
