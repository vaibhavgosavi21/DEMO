package OOP;

public class Constructor {
	String name;
	int no;
	
	Constructor(){                        //Non-Parameterised constructor or non argument constructor
		System.out.println("Constructor is called....");
	}
	
	Constructor(String name){              //Parameterised Constructor
		this.name=name;
	}
	
	Constructor(int no){
		this.no=no;
		
	}
	
	

}
	
	
