package java_�ǽ�;

import java.util.Scanner;

public class score {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int score = scan.nextInt();
		char grade;
		switch(score/10) {
		case 90:grade='A';
		case 80:grade='B';
		case 70:grade='C';
		case 60:grade='D';
		default:grade='F';
		}
		System.out.println("����� ������"+grade+"�Դϴ�.");
	}

}
