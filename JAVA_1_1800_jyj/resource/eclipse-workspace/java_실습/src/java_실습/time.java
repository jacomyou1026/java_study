package java_�ǽ�;

import java.util.Scanner;

public class time {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�� ������ ������ �Է��ϼ���");
		int time = scan.nextInt();
		int hour = (time/60)/60;
		int minute=(time/60)%60;
		int second= time%60;
		
		System.out.println(time+"�ʴ�");
		System.out.print(hour+"�ð�");
		System.out.print(minute+"��");
		System.out.print(second+"�� �Դϴ�.");
	}

}
