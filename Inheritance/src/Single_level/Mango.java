package Single_level;

public class Mango extends Fruit {
	private String color;
	private String taste;
	
	public Mango(String color, String taste,String types, String name) {
		super(types, name);
		this.color = color;
		this.taste = taste;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	
	
	public void info(){
		System.out.println("Type of Fruit: "+getTypes());
		System.out.println("Fruit Name: "+getName());
		System.out.println("Mango color: "+getColor());
		System.out.println("Mango Taste: "+getTaste());
	}
	
	

}
