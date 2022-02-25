package ex2_method;

public class MethodMain {
	public static void main(String[] args) {
		
		MethodTest m1 = new MethodTest();
		m1.test();
		m1.test();
		
		m1.test2(20);
		m1.test2(30);
		
		m1.test();
		
		int su = 100;
		m1.exam(su);
		System.out.println("su : " + su);
		
		m1.test();
		
		int su2 = 50;
		su2 = m1.exam2(su2);
		System.out.println(su2);
		
	}//main
}











