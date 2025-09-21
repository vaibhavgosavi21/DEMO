package poly1;

public class Main {

	public static void main(String[] args) {
		Fighterplane fp=new Fighterplane();
		
		Cargoplanes cp=new Cargoplanes();
		
		Commercialplanes cmp=new Commercialplanes();
		
		Airport airport=new Airport();
		airport.details(cmp);
		airport.details(fp);
		airport.details(cp);
		
		
		
		
//		fp.fly();
//		fp.landing();
//		fp.takeoff();
//		System.out.println();
//		
//		Plane plane=new Fighterplane();
//		plane.fly();
//		plane.landing();
//		plane.takeoff();
//		System.out.println();
//		
//		plane=cp;
//		plane.fly();
//		plane.landing();
//		plane.takeoff();
//		System.out.println();

	}

}
