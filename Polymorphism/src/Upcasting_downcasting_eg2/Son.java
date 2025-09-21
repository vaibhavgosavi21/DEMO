package Upcasting_downcasting_eg2;

public class Son extends Father {
	
	//method overriding - it is process of overriding parent class implementation to child class implementation
	
	public void work() {
		System.out.println("Working as developer");
	}
	 
	public static void main(String[] args) {
		Son s=new Son();
		s.work();
		
		Father f=s;
		f.work();
		
		System.out.println(f);  // genarate address
	}

}

 
