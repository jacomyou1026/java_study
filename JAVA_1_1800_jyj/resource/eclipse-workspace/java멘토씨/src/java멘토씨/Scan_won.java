package java���侾;

import java.util.Scanner;

public class Scan_won {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		int num = scan.nextInt();
		double  dollar =num/1100;
		System.out.println(num+"����$"+dollar+"�Դϴ�.");
		scan.close();
		
	}

}
