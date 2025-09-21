package Interface;

public class AcRemote implements Remote {

	@Override
	public void On() {
		System.out.println("Now Ac is On");		
	}

	@Override
	public void Off() {
		System.out.println("Now Ac if off");
	}

	@Override
	public void mode() {
		System.out.println("Change Temperature");	
	}

}