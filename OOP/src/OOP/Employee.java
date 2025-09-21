package OOP;
public class Employee{
	private int empId;
	private String empName;
	private double empSalary;


	//setter for ID
	public void setEmpId(int empId){
	this.empId=empId;
	}
	//getter for Id
	public int getEmpId(){
	return empId;
	}
	
	//setter for name
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	//getter for name
	public String getEmpName() {
		return empName;
	}
	
	//setter for empsalary
	public void setEmpSalary(double empSalary) {
		this.empSalary=empSalary;
	}
	//getter for empSalary
	public double getEmpSalary() {
		return empSalary;
	}
	
}