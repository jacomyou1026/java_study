package ex2_exception;

import java.util.Scanner;

public class Ex3_TryCatch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		
		try {
			int n = sc.nextInt();
			System.out.println("��� : " + n);
			
		}catch (Exception e) {
			System.out.println("������ �Է� ����");
			
		}
		
	}//main
}












