package Inheritance;

public class A extends B {
	static int a=10;
	int b=2;
	
	static {
		System.out.println("A sb  block1");
	}
	{
		System.out.println("ns block1 A");
	}
	static {
		System.out.println("A sb block2");
	}
	{
		System.out.println("ns block2 A");
	}
	A(){
		System.out.println("Ct1");
	}
	
	public static void main(String[] args) {
		System.out.println("Main start");
	new A();
	new A();
	System.out.println("Main end");
	
	}
}
