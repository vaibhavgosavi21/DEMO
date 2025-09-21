package OOP;
public class EmployeeMain{
	public static void main(String args[])
	{
	Employee eobj=new Employee();
	eobj.setEmpId(101);
	eobj.setEmpName("Vabhav");
	eobj.setEmpSalary(60000);
	
	System.out.println("Employee id:"+eobj.getEmpId());
	System.out.println("Employee Name: "+eobj.getEmpName());
	System.out.println("salary: "+eobj.getEmpSalary());

	}
}