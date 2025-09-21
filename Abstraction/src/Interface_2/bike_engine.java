package Interface_2;

public class bike_engine implements Engine {
	

	@Override
	public void Start() {
		System.out.println("The bike are Start");
		
	}

	@Override
	public void Stop() {
		System.out.println("The bike are Stop");
		
	}

	@Override
	public void Working() {
		System.out.println("The bike are Running");
		
	}

}
