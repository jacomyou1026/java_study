package ex_work;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Person> pArr = new ArrayList<Person>();
		Person p = null;

		while(true) {

			System.out.println("1.�����߰�");
			System.out.println("2.��������");
			System.out.println("3.��ü����");
			System.out.println("etc.�� ��");
			System.out.print(">> ");

			int select = sc.nextInt();

			switch( select ) {

			case 1://�����߰�
				System.out.println("--�����߰�--");
				p = new Person();
				
				System.out.print("�̸� : ");
				p.setName( sc.next() );
				
				System.out.print("���� : ");
				p.setAge( sc.nextInt() );
				
				System.out.print("��ȭ : ");
				p.setTel( sc.next() );
				
				pArr.add(p);
				
				System.out.println();
				break;

			case 2://��������
				System.out.println("--��������--");
				System.out.print("������ �̸� : ");
				
				String name = sc.next();
				
				for( int i = 0; i < pArr.size(); i++ ) {
					
					if( pArr.get(i).getName().equals(name) ) {
						pArr.remove(i);
						break;
					}
					
				}//for
				
				break;

			case 3://��ü����
				System.out.println("--��ü����--");
				System.out.println("����ο� " + pArr.size() + "��");
				
				for( int i = 0; i < pArr.size(); i++ ) {
					
					System.out.printf("%s / %d / %s\n", 
							pArr.get(i).getName(), 
							pArr.get(i).getAge(), 
							pArr.get(i).getTel());
					
				}//for
				
				System.out.println();
				break;

			default://����
				System.out.println("�����մϴ�");
				return;//���� �޼����� main�� ��°�� ����
			}//switch

		}//while

	}//main
}














