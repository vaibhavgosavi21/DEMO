package Multiple_inheritance;

public class Son implements Father, Mother {

	@Override
	public void mothername() {
		System.out.println("Mother name is M");

	}

	@Override
	public void fathername() {
		System.out.println("Father name is F");
	}

}
