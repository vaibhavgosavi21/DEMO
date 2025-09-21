package Single_level;

public class Car extends Vehicle{
	private String cname;
	private String color;
	private int modelno;
	public Car(String cname, String color, int modelno, int noofwheels, String type) {
		super(noofwheels, type);
		this.cname = cname;
		this.color = color;
		this.modelno = modelno;
	}
	
	public void display() {
		System.out.println("Model No: "+modelno);
		System.out.println("Car Name: "+cname);
		System.out.println("Car color: "+color);
		System.out.println("No of wheels: "+getNoofwheels());
		System.out.println("Fuel Type: "+getType());
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getModelno() {
		return modelno;
	}
	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	
	
	
}
