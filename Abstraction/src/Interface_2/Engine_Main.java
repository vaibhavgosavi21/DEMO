package Interface_2;

public class Engine_Main {

	public static void main(String[] args) {
		bike_engine beng=new bike_engine();
		
		Car_engine ceng=new Car_engine();
		
		Engine engine=beng;
		
		engine.Start();
		engine.Stop();
		
		Engine en=ceng;
		en.Start();
		en.Stop();

	}

}
