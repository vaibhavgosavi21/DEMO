package Inheritance;

public class B {
	static int c=10;
	int d=2;
	
	static {
		System.out.println("B sb block1");
	}
	{
		System.out.println("ns block1 B");
	}
	
	static {
		System.out.println("B sb block2");
	}
	{
		System.out.println("ns block2 B");
	}
	B(){
		System.out.println("ctB");
	}
	
}
