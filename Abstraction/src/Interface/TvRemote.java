package Interface;

public class TvRemote implements Remote {

	@Override
	public void On() {
		System.out.println("Now TV is on");
		
	}

	@Override
	public void Off() {
		System.out.println("Now TV is off");
	}

	@Override
	public void mode() {
		System.out.println("Change the mode");
		
	}

}
