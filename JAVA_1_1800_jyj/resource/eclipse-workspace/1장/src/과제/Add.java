package ����;
import java.util.*;
public class Add {
	int a; int b;
	void setValue(int x, int y){
		a = x;
		b =y;
	}
	int calculate() {
		return a+b;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�� ������ �����ڸ� �Է��Ͻÿ�>>");
		int a= scan.nextInt();
		int b= scan.nextInt();
		char c=scan.next().charAt(0);
		switch(c) {
		case'+':
			Add add =new Add();
			add.setValue(a, b);
			System.out.print(add.calculate());
			break;
		
		case'-':
			Sub sub =new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
			break;
		case '*':
			Mul mul =new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
			break;
		
		case '/':
			Div div =new Div();
			div.setValue(a, b);
			System.out.println(div.calculate());
			break;
			
		}
		System.out.println();
			
		}

}
