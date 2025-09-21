package While_Loop;

public class loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1;
		
		while(a<=10) {
			System.out.println(a);//1 3 5 7 9 
			a++;//2 4 6 8 10
			
			if(a>6) {//2>6   8>6  10>6
				System.out.println(a);// 8  10
				a++;				//  9 11
			}
			System.out.println(a);//2 4  6
			a++;				//3  5 7
		}
	}

}
