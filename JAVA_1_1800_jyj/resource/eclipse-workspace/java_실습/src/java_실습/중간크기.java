package java_�ǽ�;

import java.util.Scanner;

public class �߰�ũ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("���� 3�� �Է� >>");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		if(num1<num2&&num2<num3) {System.out.println("�߰���:"+num2);}
		else if(num2<num1&&num1<num3) {System.out.println("�߰���:"+num1);}
		else {
			{System.out.println("�߰���:"+num3);}
		}
		scan.close();
	}

}
