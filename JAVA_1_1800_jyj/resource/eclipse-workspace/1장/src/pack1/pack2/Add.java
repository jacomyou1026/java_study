package pack1.pack2;
import java.util.*;
public class Add {
	Scanner scan = new Scanner(System.in);
	int a; int b; String c;
	void setValue(int x, int y){
		a = x;
		b =y;
	}
	int calculate() {
		System.out.println("두 정수와 연산자를 입력하시오>>");
		a= scan.nextInt();
		b= scan.nextInt();
		c=scan.next();
		return a+b;}
	}
	public static void main(String[] args) {
		
	}
}
