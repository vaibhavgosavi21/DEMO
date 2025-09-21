package OOP;

public class empMain {

	public static void main(String[] args) {
		emp eobj=new emp();
		eobj.setEmpId(101);
		eobj.setEmpName("Vaibhav");
		eobj.setEmpSalary(50000);
		
		System.out.println("Employee id:"+eobj.getEmpId());
		System.out.println("Employee Name: "+eobj.getEmpName());
		System.out.println("Employee Salary: "+eobj.getEmpSalary());
	}

}
