package ex1_string_method;

import java.util.Scanner;

public class Ex3_StringWork {
	public static void main(String[] args) {
		
		//Ű���忡�� �ƹ����̳� �������̷� �Է��� �޴´�
		//�Է¹��� ���� �ҹ��� a�� �� �� �ִ��� ������ ����Ͻÿ�
		
		//�Է� : aF$%^kjaper
		//a�� ���� : 2
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String str = sc.next();
		
		int count = 0;
		
		for( int i = 0; i < str.length(); i++ ) {
			
			if( str.charAt(i) == 'a' ) {
				count++;
			}	
		}
		
		System.out.println("a�ǰ��� : " + count);	
		
	}//main
}







































