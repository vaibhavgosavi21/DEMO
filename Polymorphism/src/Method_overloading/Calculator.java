package Method_overloading;

//method overloading : same method used many times with same name but different parameter

public class Calculator {
	
	void sum(int a, int b){
		System.out.println(a +b);
	}
	 
	void sum(float a, float b) {
		System.out.println( a+ b);
	}
	
	void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		
		calc.sum(2, 3);
		calc.sum(2.2f, 2.4f);
		calc.sum(1, 2, 3);
	}

}

