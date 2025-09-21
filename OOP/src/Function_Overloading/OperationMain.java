package Function_Overloading;

class Demo{
	public void display(int n1,int n2) {
		if(n1>n2) {
			System.out.println("Greater number is n1");
		}
		else {
			System.out.println("Greater number is n2");
		}
	}
	
	public void display(float n1, float n2) {
		if(n1>n2) {
			System.out.println("greater number is n1 in float");
		}
		else {
			System.out.println("greater number in n2 in  float");
		}
	}
}



public class OperationMain {

	public static void main(String[] args) {
		Demo d1=new Demo();
		d1.display(10, 20);
		d1.display(1.2f, 2.2f);
	}

}
