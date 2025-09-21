package Hybrid_Inheritance;

public class empaddr extends employee {
	private String city;
	private String State;
	private int pincode;
	public empaddr(String ename, int empid, String job, int age, String jobtype, String city, String state,
			int pincode) {
		super(ename, empid, job, age, jobtype);
		this.city = city;
		State = state;
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public void Employeeingfo() {
		System.out.println("--------Employee Info----------");
		System.out.println("Emp Id: "+getEmpid());
		System.out.println("Emp Name: "+getEname());
		System.out.println("Empo age: "+getAge());
		System.out.println("Emp job: "+getJobtype());
		System.out.println("Emp City: "+getCity());
		System.out.println("Emp State: "+getState());
		System.out.println("Emp Pincode: "+getPincode());
	}
	
	
	
}
