package java���侾;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class updown_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int low,high;
		int card;
		Random ran = new Random();
		while(true) {
			int i=0;
			low=0;
			high =99;
			card = ran.nextInt(100)+1;
			System.out.println("up&down�����Դϴ�. ������ ���� ���־� ������");
			while(true) {
				System.out.println(low+"~"+high);
				System.out.println(i+1+">>");
				int n=0;
				
				try {
					n=scan.nextInt();
				}catch(InputMismatchException e) {
					System.out.println("������ �Է��ϼž� �մϴ�.");
					scan.nextLine();
					continue;
				}
				if(n>high||n<low) {
					System.out.println("������ ������ϴ�.");
				}else {
					if(n==card) {
						System.out.println("�½��ϴ�.");
						break;
					}
					else if(n>card) {
						System.out.println("�� ����");
						high =n;
					}
					else {
						System.out.println("�� ����");
						low=n;
					}
				}
				i++;
			}
			System.out.println("�ٽ� �ϰڽ��ϱ�>>(y/n)");
			if(scan.nextLine().equals("n")) {
				break;
			}
			scan.close();
		}
	}

}
