package java���侾;

import java.util.Scanner;
public class WhileEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String answer="y";
		int count =0;
		while(answer.equals("y")) {
			System.out.println("������ ����Ͻðڽ��ϱ�?(y)");
			answer =scan.nextLine();
			if(answer.equals("y")) {
				System.out.printf("������ %d�� ����Ͽ����ϴ�.\n",++count);
			}
		}
		System.out.println("��� ����");
	}

}
