package ex_work;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<Person> pArr  =new ArrayList<Person>();
		Person p = null;
		String s = "1.�����߰�\n2.��������\n3.��ü����\netc. ����\n>>";
		 while(true) {
			System.out.println(s);
			int select =sc.nextInt();
			switch(select) {
			//�����߰�
			case 1:
				System.out.println("--�����߰�--");
				p = new Person();
				System.out.print("�̸� : ");
				p.setName(sc.next());
				
				System.out.println("���� : ");
				p.setAge(sc.nextInt());
				
				System.out.println("��ȭ : ");
				p.setTel(sc.next());
				pArr.add(p);
				
				System.out.println();
				break;
				
			//��������
			case 2:
				System.out.println("--���� ����--");
				System.out.print("������ �̸� : ");
				String name = sc.next();
				
				for (int i = 0; i < pArr.size(); i++) {
					if(name.equals(pArr.get(i).getName())) {
						System.out.println("�ߺ��Դϴ�.");
						pArr.remove(i);
					}
				}
				break;
				
			//��ü����
			case 3:
				System.out.println("--��ü ����--");
				System.out.println("����ο�"+pArr.size()+"��");
				for (int i = 0; i < pArr.size(); i++) {
					System.out.printf("%s/%d/%s\n",pArr.get(i).getName(),
							pArr.get(i).getAge(),
							pArr.get(i).getTel());
				}
				System.out.println();
				break;
			//����
			default :
				System.out.println("����");
				return; //���� �޼����� main�� ��°�� ����
			}
				
			
		}
	}
}
