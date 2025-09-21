package Function_Overloading;

class Area{
	int area;
	double pi=3.14;
	public void display(int length, int breadth) {
		 area=length*breadth;
		 System.out.println("Area of Rectangle: "+area);
	}
	
	public void display(int base, short height) {
		area=1/2*(base*height);
		 System.out.println("Area of Triangle: "+area);
	}
	
	public void display(int side) {
		area=side*side;
		System.out.println("Area of Square: "+area);
	}
	
	public void display(float radius) {
		float areaofcircle=22/7*(radius*radius);
		System.out.println("Area of Circle: "+area);
	}

}

public class AreaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a=new Area();
		a.display(15,10);
		a.display(5,9);
		a.display(10);
		a.display(33f);
	}

}
