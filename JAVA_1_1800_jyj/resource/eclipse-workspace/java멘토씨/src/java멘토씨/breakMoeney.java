package java���侾;

import java.util.Scanner;

public class breakMoeney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ���� ���� �Է��ϼ���");
		int money=scan.nextInt();
		System.out.println("���� ��������"+money+"�Դϴ�.");
		int i;
		while(true){
			System.out.println("�󸶸� ����ϰڽ��ϱ�??");
			i=scan.nextInt();
			if(!(0<=i&&i<=money)) {
				System.out.println("�ٽ� �Է����ּ���");
				continue;
			}
			System.out.printf("����%d�� ���ҽ��ϴ�.",money-=i);
			if(money==0) {
				System.out.println("���� 0���� ���ҽ��ϴ�.");
				System.out.println("��� ���� ����մϴ�. ����");
				break;
			}
			
			
			
		}
		System.out.println("��� ����");
	}

}
