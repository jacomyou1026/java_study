package pack1.pack2;

public class MethodCall {
	static int a;
	int b;
	static void seta(int i) {
		a=i;
	}
	void setb(int i) {
		b=i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodCall obj1 = new MethodCall();
		MethodCall obj2 = new MethodCall();
		seta(10);
		System.out.println(MethodCall.a);
		obj1.seta(20);
		System.out.println(MethodCall.a);
		System.out.println(obj1.a);
		obj1.setb(30);
		System.out.println(MethodCall.a);
		
	}

}
