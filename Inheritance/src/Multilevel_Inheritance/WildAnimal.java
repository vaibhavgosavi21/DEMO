package Multilevel_Inheritance;

public class WildAnimal extends Animal {
	private String placetolive;
	private String typeoffood;
	public WildAnimal(String placetolive, String typeoffood,String category, int size) {
		super( category,  size);
		this.placetolive = placetolive;
		this.typeoffood = typeoffood;
	}
	
	
	public String getPlacetolive() {
		return placetolive;
	}
	public void setPlacetolive(String placetolive) {
		this.placetolive = placetolive;
	}
	public String getTypeoffood() {
		return typeoffood;
	}
	public void setTypeoffood(String typeoffood) {
		this.typeoffood = typeoffood;
	}
	
	
	
	
	
}
