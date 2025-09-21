package Hybrid_Inheritance;

public class manager extends Person {
	private String mname;
	private int mngrid;
	private int salary;
	public manager(String mname, int mngrid, int salary,int age, String jobtype) {
		super(age, jobtype);
		this.mname = mname;
		this.mngrid = mngrid;
		this.salary = salary;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getMngrid() {
		return mngrid;
	}
	public void setMngrid(int mngrid) {
		this.mngrid = mngrid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public void managerinfo() {
		System.out.println("---------Manager detail---------");
		System.out.println("Job Type: "+getJobtype());
		System.out.println("Manager Name: "+getMname());
		System.out.println("M. Age: "+getAge());
		System.out.println("Manager Id: "+getMngrid());
		System.out.println("Manager Salary: "+getSalary());
		
	}
	
	

}
