package Method_Overriding;

public class animalMain {

	public static void main(String[] args) {

		animalchild c = new animalchild();
		c.name();

		Animal a = c;
		c.name();
	

//		Animal a=new Animal();
//		a.name();

	}

}
