package java_�ǽ�;

import java.util.Scanner;

public class ten_equal_one {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		int num = scan.nextInt();
		if(num>=10&&num<100) {
			
			if(num/10==num%10) {
				System.out.println("yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
			}else {
				System.out.println("no! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
			}
		}else {
			System.out.println("2�ڸ��� ������ �ƴմϴ�.");
		}
		scan.close();
		
	}
}
