package java∏‡≈‰ææ;

public class Generic_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A4<Integer> a1 = new A4<>();
		a1.x = 10;
		a1.y = 23;
		System.out.println(a1.x + a1.y);
		
		A4<String>a2 = new A4<>();
		a2.x="hello ";
		a2.x="world";
		System.out.println(a2.x + a2.y);
		
	}

}

class A4<T> {
	T x;
	T y;
}