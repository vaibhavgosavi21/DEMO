package Remote;

public class Main {

	public static void main(String[] args) {
		ACremote ac=new ACremote();
		
		TVremote tv=new TVremote();
		
		ac.PowerOn();
		ac.PowerOff();
		
		tv.PowerOn();
		tv.PowerOff();

	}

}
