package java���侾;

public class inner_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outer = new OuterClass();
		System.out.println("OuterClass�� a�� ��:"+outer.a);
		System.out.println("OuterClass�� b�� ��:"+OuterClass.b);
		System.out.println();
		
		//����Ŭ����: �ν��Ͻ�
		OuterClass outer1 = new OuterClass();
		OuterClass.Inner i = outer1.new Inner();
		System.out.println("Inner�� c��"+i.c);
		i.innerMethod();
		
		System.out.println();
		OuterClass.StaticInner s1 = new OuterClass.StaticInner();
		System.out.println("StaticInner d�ǰ�"+s1.d);
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
	

