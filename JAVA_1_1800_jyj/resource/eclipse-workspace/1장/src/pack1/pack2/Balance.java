package pack1.pack2;

public class Balance {
	String name;
	double bal;
	public Balance(String n, double b) {
		name = n;
		bal = b;
	}
	public void show() {
		if(bal>0) {
			System.out.print("==>");
			System.out.println(name+": $"+bal);
		}
	}
	public static void main(String[] args) {
		Balance test =  new Balance("kim",33);
		test.show();
	}
}
