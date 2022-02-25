package pack1.pack2;

class showclass{
	public static void test() {
		System.out.println("Animal");
	}
	public void testIn() {
		System.out.println("instavs Animal");
	}
}

public class show extends showclass{
	public static void test() {
		System.out.println("cat");
}
	public void testIn() {
		System.out.println("catin");
	}
public static void main(String[] args) {
	show myshow = new show();
	showclass myAnimal = myshow;
	showclass.test();
	show.test();
	test();
	
}
}
