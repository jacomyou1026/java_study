package ex1_if;

import java.util.Scanner;

public class �ִ����� {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("��1: ");
		int n1 =sc.nextInt();
		
		System.out.println("��2 :");
		int n2= sc.nextInt();
		int i = 0;
		for (i = n1; i >=1 ; i--) {
			if(n1%i==0&&n2%i==0) {
				break;
			}
		}
		if(i==1) {
			System.out.println("�ִ������� �����ϴ�.");
		}else {
			System.out.println("�ִ����� : "+i);
		}
	}
	
}
