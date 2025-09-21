package Inheritance;

public class Wipro extends Company {
	private long employeeCount;
	private String loc;
	private int noOfsept;
	private String workinghours;
	
	public void develop() {
		System.out.println("Developing projects.......");
	}

	public long getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(long employeeCount) {
		this.employeeCount = employeeCount;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public int getNoOfsept() {
		return noOfsept;
	}

	public void setNoOfsept(int noOfsept) {
		this.noOfsept = noOfsept;
	}

	public String getWorkinghours() {
		return workinghours;
	}

	public void setWorkinghours(String workinghours) {
		this.workinghours = workinghours;
	}
	
	

}
