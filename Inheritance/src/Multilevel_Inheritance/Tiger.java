package Multilevel_Inheritance;

public class Tiger extends WildAnimal {
	private String color;
	private int legs;
	
	public Tiger(String color, int legs,String placetolive,String typeoffood,String category, int size) {
		super(placetolive,typeoffood,category, size);
		this.color = color;
		this.legs = legs;
	}

	public void display() {
		System.out.println("Animal Category: "+getCategory());
		System.out.println("Size of an Animal: "+getSize());
		System.out.println("Place Where Animal live: "+getPlacetolive());
		System.out.println("Type of food of animal:"+getTypeoffood());
		System.out.println("Color Of Animal: "+getColor());
		System.out.println("No of legs: "+getLegs());
	}
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	
	
	

}
