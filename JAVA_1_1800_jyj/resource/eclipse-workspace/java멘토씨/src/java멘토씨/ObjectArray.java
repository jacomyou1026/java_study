package java���侾;
public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aclass ar[] = new Aclass[3];
		ar[0]=new Aclass();
		ar[0].x=100;
		ar[0].f1();
		System.out.println(ar[0].x);
	}

}
class Aclass{
	int x;
	void f1() {
		System.out.println("f1()");
	}
}
