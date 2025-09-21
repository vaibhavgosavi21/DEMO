package UP_downcasting_eg3;

public class devicemain {

	public static void main(String[] args) {

		Laptop l = new Laptop("Laptop", "Hardware", "HP Elitebook", 7986896, 90000);

		l.laptopinfo();
		System.out.println();
			
		Device d=new Laptop("Laptop", "Hardware", "Asus ZenBook", 7986896, 190000);
		l.laptopinfo();
		

	}

}
