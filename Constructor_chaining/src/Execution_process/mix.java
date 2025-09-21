package Execution_process;

public class mix {
	static String name;
	int no;


	void show() {
		System.out.println("Non static method");
	}
	
	
	
	mix(){
		System.out.println("Constructor");
	}
	
	static void display() {
		System.out.println("Static method");
	}
	
	{
		System.out.println("Non Static block");
	}
	static{
		System.err.println("Static block");
	}
	
	
	public static void main(String[] args) {
		mix mx=new mix();
		mx.display();
		mx.show();
	}
}
