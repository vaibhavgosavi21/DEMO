package OOP;

public class emp {
	private int empId;
	private String empName;
	private double empsalary;
	
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	public int getEmpId(){
		return empId;
	}
	
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public  void setEmpSalary(double empsalary) {
		this.empsalary=empsalary;
	}
	
	public double getEmpSalary() {
		return empsalary;
	}

}
