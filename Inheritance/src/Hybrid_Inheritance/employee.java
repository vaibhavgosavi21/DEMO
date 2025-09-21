package Hybrid_Inheritance;

public class employee extends Person {
	private String ename;
	private int empid;
	private String job;
	public employee(String ename, int empid, String job,int age, String jobtype) {
		super(age, jobtype);
	
		this.ename = ename;
		this.empid = empid;
		this.job = job;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
	
	 
}
