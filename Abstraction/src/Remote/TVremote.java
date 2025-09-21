package Remote;

//Implementations
class TVremote extends Remote {
	@Override
	void PowerOn() {
		System.out.println("TV is turned ON");
	}

	@Override
	void PowerOff() {
		System.out.println("TV is turned OFF");
	}
}


