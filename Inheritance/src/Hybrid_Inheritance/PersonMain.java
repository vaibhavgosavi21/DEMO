package Hybrid_Inheritance;

public class PersonMain {

	public static void main(String[] args) {
		empaddr emp=new empaddr("Vaibhav",101,"Software Developer",22,"Software","Pune","Maharashtra",414150);
		emp.Employeeingfo();
		
		
		manager mngr=new manager("Ram",501,80000,34,"Manager");
		mngr.managerinfo();
		
	}

}
