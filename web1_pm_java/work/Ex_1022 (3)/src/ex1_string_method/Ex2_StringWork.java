package ex1_string_method;

import java.util.Scanner;

public class Ex2_StringWork {
	public static void main(String[] args) {
		
		//Ű���忡�� �ֹι�ȣ�� ���� �� �Ʒ��� ���� ����Ͻÿ�
		//----------------------
		//�ֹι�ȣ(-����) : 001211-4234567 
		//����� 00�� 12�� 11�Ͽ� �¾ �����Դϴ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ(-����) : ");
		String jumin = sc.next();
		
		if( jumin.trim().length() != 14 || 
				jumin.trim().charAt(6) != '-') {
			
			System.out.println("�ֹι�ȣ�� �ùٸ��� �Է��ϼ���");
			
		}else {
			
			String year = jumin.substring(0, 2);			
			String month = jumin.substring(2, 4);
			String day = jumin.substring(4, 6);
			String gender = ""; 
			char g = jumin.charAt(7);
			
			if( g % 2 == 1 ) {
				gender = "����";
			}else {
				gender = "����";
			}
			
			System.out.printf("����� %s�� %s�� %s�Ͽ� �¾ %s�Դϴ�", 
								year, month, day, gender );
		}
		
		//char�� int�� ����
		char ch = '9';
		String ss = "" + ch;
		int n = Integer.parseInt(ss);
		
	}//main
}























