package java_½Ç½À;

public class class_Array {

	public static void main(String[] args) {
		Cclass ar[]=new Cclass[3];
		ar[0]=new Cclass();
		ar[0].x=10;
		ar[0].f2();
		
	}
}
class Cclass{
	int x;
	void f2() {
		System.out.println("x:"+x);
	}
}