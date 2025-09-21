package Multilevel_Inheritance;

public class Father extends GrandFather {
	private String fname;
	private int fage;
	
	public Father(String fname, int fage,int age, String name) {
		super(age, name);
		this.fname = fname;
		this.fage = fage;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public int getFage() {
		return fage;
	}

	public void setFage(int fage) {
		this.fage = fage;
	}
	

}
