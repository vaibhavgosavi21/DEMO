package UP_downcasting_eg3;

public class Laptop extends Device {
	
	private String modelname;
	private int modelno;
	private double price;
	public Laptop(String dname, String dtype, String modelname, int modelno, double price) {
		super(dname, dtype);
		this.modelname = modelname;
		this.modelno = modelno;
		this.price = price;
	}
	
	
	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	public int getModelno() {
		return modelno;
	}

	public void setModelno(int modelno) {
		this.modelno = modelno;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}




	void laptopinfo() {
		System.out.println("Device type:"+getDtype());
		System.out.println("Device Name:"+getDname());
		System.out.println("Laptop Model: "+getModelname());
		System.out.println("Laptop Model No:"+getModelno());
		System.out.println("Price: "+getPrice());
	}
	
	

}
