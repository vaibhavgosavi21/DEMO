package example3;

public class Employee extends Manager {
	private String name="Vaibhav";
	private String job="Software";
	private String role="Developer";
	private double sal=90000;
	void empinfo() {
		System.out.println("Emp Name: "+ name);
		System.out.println("Emp Job: "+job);
		System.out.println("Emp role: "+role);
	}
	
	void sal() {
		System.out.println("Salary: "+sal);
	}

	
	
	
}




