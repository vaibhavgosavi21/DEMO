package Upcasting_Downcasting;

public class personMain {

	public static void main(String[] args) {

		// upcasting:-> transfering reference from child class to parent class reference

		Manager ma = new Manager();
		ma.eng();
		ma.personinfo();
		ma.mnginfo();
		System.out.println();

		// Downcasting transferring reference from parent to child
		Person p = new Manager();
		p.personinfo();
		

		Engineer e = (Engineer) p;
		e.eng();
		e.personinfo();
		System.out.println();

		Manager m = (Manager) p;
		m.eng();
		m.personinfo();
		m.mnginfo();

	}

}
