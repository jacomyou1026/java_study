package java���侾;

import java.util.Random;

public class Pokemon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		System.out.println("�١١١١� Random Choosing a Pokemon�١١١١�");
		System.out.println("1. ��ī��");
		System.out.println("2. ���α�");
		System.out.println("3. �̻��ؾ�");
		System.out.println("�١١١١١١١١١١١١١١١١١١١١١١١١١١١١١�");
		int mypokemon = ran.nextInt(3)+1; // 1~3
		System.out.println("���õ� ��ȣ :"+mypokemon);
		switch(mypokemon) {
		case 1: 
			System.out.println("��ī�� ����!! �鸸��Ʈ!!");
			break;
		case 2: 
			System.out.println("���ϱ� ����!!������!!");
			break;
		case 3: 
			System.out.println("�̻��ؾ� ����! ����!!!");
			break;
		}
		
		
		
		

	}

}
