package EmployeeWithDepartment;

public class Department {
	
	
	
	private int deptd;
	private String dName;
	private String dLoc;
	public Department(int deptd, String dName, String dLoc) {
		
		this.deptd = deptd;
		this.dName = dName;
		this.dLoc = dLoc;
	}

	public int getDeptd() {
		return deptd;
	}
	public void setDeptd(int deptd) {
		this.deptd = deptd;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getdLoc() {
		return dLoc;
	}
	public void setdLoc(String dLoc) {
		this.dLoc = dLoc;
	}
	
	
	

}
