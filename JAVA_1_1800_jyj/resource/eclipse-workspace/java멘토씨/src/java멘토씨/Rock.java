package java���侾;

import java.util.Random;

public class Rock { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		System.out.println("�١١١١١١ٰ��������� ����ġ �١١١١١١�");
		
		System.out.println("1.�ָ� 2.���� 3.��");
		System.out.println("������ �ּ���");
		int person1 = ran.nextInt(3)+1;
		int person2 = ran.nextInt(3)+1;
		System.out.println("person1�� "+person1);
		System.out.println("person2�� "+person2);
		if(person1==person2) {		
				System.out.println("�����ϴ�. �ٽ����ּ���");
			}
		if(person1==1) {
			if(person2==2) {
				System.out.println("person1�� �̰���ϴ�. �ָ�>����");
			}
			else if(person2==3) {
				System.out.println("person2�� �̰���ϴ�. �ָ�<��");
			}
		}
		
		
			
	
	}

}
