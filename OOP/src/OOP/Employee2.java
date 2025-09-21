package OOP;

public class Employee2 {
	private int empId;
	private String eName;
	private double eSalary;
	
	
	//Default Constructor
//		public Employee2() {
//			System.out.println("Default constructor...");
//			
//		}
		
	//No-Argument Constructor
		public Employee2() {
			empId=101;
			eName="abcd";
			eSalary=50000;
			System.out.println("Employee Default....");
		}
		
	//Parameterized constructor
	public Employee2(int empId, String eName, double eSalary) {
		
		this.empId = empId;
		this.eName = eName;
		this.eSalary = eSalary;
	}
	
	//Copy Constructor
	public Employee2(Employee2 obj) {
		this.empId=obj.empId;
		this.eName=obj.eName;
		this.eSalary=obj.eSalary;
		
	}
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double geteSalary() {
		return eSalary;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}
	
	
	
	
}
