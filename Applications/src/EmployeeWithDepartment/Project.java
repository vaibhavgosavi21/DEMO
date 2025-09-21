package EmployeeWithDepartment;

public class Project {
	private int proId;
	private String proName;
	private int startdate;
	private int duration;
	public Project(int proId, String proName, int startdate, int duration) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.startdate = startdate;
		this.duration = duration;
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public int getStartdate() {
		return startdate;
	}
	public void setStartdate(int startdate) {
		this.startdate = startdate;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	

}
