package java_�ǽ�;

import java.util.Scanner;

public class triangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("������ 3�� �Է�>>");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		//�ﰢ���� �Ƿ��� ���� �� ���� 2���� �պ��� �۾ƾ� �Ѵ�.
		if(num1<(num2+num3)||num2<(num1+num3)||num3<(num2+num1)) {
			System.out.println("�ﰢ���� ���� �� �ִ�.");
		}else {
			System.out.println("�ﰢ���� ���� �� ����.");
			
		}
		
	}

}
