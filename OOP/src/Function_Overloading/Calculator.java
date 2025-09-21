package Function_Overloading;

public class Calculator {

	public static void main(String[] args) {

		Sum c=new Sum();
		c.Add1(10, 20);
		c.Add2(12, 20, 21);
		c.Add3(22, 10);

		Sub s=new Sub();
		s.Sub1(90, 20);
		s.Sub2(70, 10, 10);
		s.Sub3(334, 10, 230, 220);
	}

}



class Sum{
	
	public void Add1(int n1, int n2) {             //number of parameter
		System.out.println("sum of int & int of Two Number: "+(n1+n2));
	}
	
	public void Add2(int n1, int n2, int n3) {
		System.out.println("Sum of three int  number: "+(n1+n2+n3));
	}
	
	public void Add3(int n1, double n2 ) {			//type of parameter
		System.out.println("Sum int & double: "+(n1+n2));
	}
	
}

class Sub{
	public void Sub1(int n1, float n2) {
		System.out.println("Substraction of int & float of Two Number: "+(n1-n2));
	}
	
	public void Sub2(int n1, int n2, int n3) {
		System.out.println("Substraction of three number: "+(n1-n2-n3));
	}
	
	public void Sub3(int n1, int n2, int n3, int n4 ) {
		System.out.println("Substraction of Four Numbers: "+(n1-n2-n3-n4));
	}
}