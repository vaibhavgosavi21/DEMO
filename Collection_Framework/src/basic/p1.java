package basic;

import java.util.*;

public class p1 {

	public static void main(String[] args) {
		
//		ArrayList obj=new ArrayList();
//		
//		obj.add(10);
//		obj.add("hello");
//		obj.add(false);
//		obj.add('c');
//		obj.add(1,12.24);
//		
////		System.out.println(obj.get(2));
//		
//		for(int i=0; i<obj.size(); i++) {
//			System.out.println(obj.get(i));
//		}
//		
//		System.out.println();
//		//enhance for loop
//		for(Object a:obj) {
//			System.out.println(a);
//		}
//		
//		//foreach loop- functional programming
//		obj.forEach(val->System.out.println(val));
//		
//	
//		Vector v=new Vector();
//		
//		v.add("Welcome");
//		
//		
//		System.out.println(obj.isEmpty());
//		
		
		
		ArrayList obj=new ArrayList();
		
		obj.add(10);
		obj.add("hello");
		obj.add(false);
		obj.add('c');
		obj.add(1,12.24);
		
		System.out.println(obj);
		
		obj.remove(1);
		System.out.println(obj);
		
		obj.remove("hello");
		System.out.println(obj);
			
		obj.remove(Integer.valueOf(10));
		System.out.println(obj);

		
Vector vobj=new Vector();
		
		vobj.add(10);
		vobj.add("hello");
		vobj.add(false);
		vobj.add('c');
		vobj.add(1,12.24);
		
		System.out.println(obj);
		
		vobj.remove(1);
		System.out.println(obj);
		
		vobj.remove("hello");
		System.out.println(obj);
			
		vobj.remove(Integer.valueOf(10));
		System.out.println(obj);

	}

}
