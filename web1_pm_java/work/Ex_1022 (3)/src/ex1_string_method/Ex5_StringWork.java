package ex1_string_method;

import java.util.Scanner;

public class Ex5_StringWork {
	public static void main(String[] args) {
		
		//Ű���忡�� ���� ���� ȸ�������� �Ǵ��ϱ�
		
		//�Է� : a123a
		//a123a ��(��) ȸ������ �ƴմϴ�
		
		//�Է� : ab1c1ba
		//ab1c1ba ��(��) ȸ���� �Դϴ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� : ");
		String ori = sc.next();//����
		String rev = "";//������ ����� ������ ����
		
		for( int i = ori.length()-1; i >= 0; i-- ) {
			//���� ���ڿ��� ����� rev������ ����
			rev += ori.charAt(i);
			
		}//for
		
		if( ori.equals(rev) ) {
			System.out.println(ori + "��(��) ȸ����");
		}else {
			System.out.println(ori + "��(��) ��ȸ����");
		}
		
	}//main
}













