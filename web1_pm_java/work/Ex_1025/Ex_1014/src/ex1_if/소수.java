package ex1_if;

import java.util.Scanner;

public class �Ҽ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� : ");
		int n =sc.nextInt();
		int i=0;
		for ( i = 2; i <=n; i++) {
			if(n%i==0) {
				break;
			}
		}
		if(i==n) {
			System.out.println(n+"�� �Ҽ��Դϴ�.");
		}else {
			System.out.println(n+"�� �Ҽ��� �ƴմϴ�.");
		}
		
	}
}
