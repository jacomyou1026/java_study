package java∏‡≈‰ææ;

public class FirstClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA ca = new ClassA();
		System.out.println(ca.x);
		ca.f1();
		ca.x=30;
		System.out.println(ca.x);
	}

}

class ClassA{
	int x=10;
	void f1() {
		System.out.println("f1()");
	}
}
