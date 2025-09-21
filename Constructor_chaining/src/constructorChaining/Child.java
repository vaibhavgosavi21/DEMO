package constructorChaining;

public class Child extends Parent {
	
	Child(){
		System.out.println("No argument");
	}
	
	Child(int a){
		System.out.println(a);
	}
	
	Child(char b){
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		new Child(97);
		new Child();
		new Child('a');
		
	}
	
	

}
