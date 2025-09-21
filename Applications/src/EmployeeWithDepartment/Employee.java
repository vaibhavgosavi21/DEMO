package EmployeeWithDepartment;

public class Employee {

		private int empId;
		private String empName;
		private double empSal;
		private String desg;  //designation
		
		public Employee(int empId, String empName, double empSal, String desg) {
			
			this.empId = empId;
			this.empName = empName;
			this.empSal = empSal;
			this.desg = desg;
		}
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public double getEmpSal() {
			return empSal;
		}
		public void setEmpSal(double empSal) {
			this.empSal = empSal;
		}
		public String getDesg() {
			return desg;
		}
		public void setDesg(String desg) {
			this.desg = desg;
		}
		
		
}
