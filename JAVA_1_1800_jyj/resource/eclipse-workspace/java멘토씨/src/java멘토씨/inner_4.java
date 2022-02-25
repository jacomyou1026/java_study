package java멘토씨;

public class inner_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outer = new OuterClass();
		System.out.println("OuterClass의 a의 값:"+outer.a);
		System.out.println("OuterClass의 b의 값:"+OuterClass.b);
		System.out.println();
		
		//내부클래스: 인스턴스
		OuterClass outer1 = new OuterClass();
		OuterClass.Inner i = outer1.new Inner();
		System.out.println("Inner의 c값"+i.c);
		i.innerMethod();
		
		System.out.println();
		OuterClass.StaticInner s1 = new OuterClass.StaticInner();
		System.out.println("StaticInner d의값"+s1.d);
		s1.staticMethod();
		OuterClass.StaticInner.staticMethod();
	}

}
class OuterClass{
	int a=3;
	static int b=4;
	class Inner{
		int c=5;
		public void innerMethod() {
		System.out.println("<Inner class>");	
		}
	}
	static class StaticInner{
	int d=6;
	static int stat=10;
	public static void staticMethod() {
		System.out.println("<StaticInner class>");
	}
	}
}
	

