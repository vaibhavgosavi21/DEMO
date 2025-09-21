package example3;

public class Main {

	public static void main(String[] args) {
		//upcasting
		Employee e=new Employee();
		e.empinfo();
		e.sal();
		e.managerinfo();
		
		
		Manager m=new Employee();
		m.managerinfo();
		
		Manager ma=(Employee)m;
		
		

	}

}
