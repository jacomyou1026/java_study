package java���侾;

import java.util.Scanner;

public class SwitchEx_book {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ϳ⵿�� ���� å ���� ���� ��Ʈ�� ���
		Scanner scan = new Scanner(System.in);
		System.out.println("�ϳⰣ ����� å�� �����̳���???");
		int book =scan.nextInt();
		book = book/10;
		switch(book) {
		case 0: // 10�� �̸�
			System.out.println("���� �� ����ϼ���");
			break;
		case 1://10<=book<20
			System.out.println("å �д� ���� ���ô� ���̳׿�!");
			break;
		case 2: //20<=book<30 
			System.out.println("å�� ����Ͻôº��̳׿�");
			break;
		default://book>=3o
			System.out.println("����� �ٵ����Դϴ�.");
		}
		
		
	}

}
