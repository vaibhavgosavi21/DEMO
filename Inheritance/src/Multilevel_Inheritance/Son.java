package Multilevel_Inheritance;

public class Son extends Father {
	private String sname;
	private int sage;
	
	public Son(String sname, int sage,String fname, int fage, String name,int age) {
		super(fname,fage,age,name);
		this.sname = sname;
		this.sage = sage;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}
	
	public void Display() {
			System.out.println("Grandfather Name: "+getName());
			System.out.println("Greandfater Age: "+getAge());
			System.out.println();
			System.out.println("Father Name: "+getFname());
			System.out.println("Father Age: "+getFage());
			System.out.println();
			System.out.println("Son Name: "+getSname());
			System.out.println("Son age: "+getSage());
	}
	
}
