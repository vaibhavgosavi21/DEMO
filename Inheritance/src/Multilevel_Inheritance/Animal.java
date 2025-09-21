package Multilevel_Inheritance;

public class Animal {
	private String Category;
	private int size;
	public Animal(String category, int size) {
		super();
		Category = category;
		this.size = size;
	}
	
	
	public void display() {
		System.out.println();
	}


	public String getCategory() {
		return Category;
	}


	public void setCategory(String category) {
		Category = category;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}
	
	
	
	
	
	
	

}
