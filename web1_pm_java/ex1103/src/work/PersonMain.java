package work;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String infomation = "1.�����߰�\n2.��������\n3.��ü����\netc ����";
		String name ="";
		int age=0;
		String tel ="";
		while (true) {
			System.out.println(infomation);
			int num = sc.nextInt();
			Person p =new Person();
			if(!(num>=1&&num<=3)) {
				break;
			}
			switch (num) {
			//�����߰�
			case 1:
				PersonDAO pd = new PersonDAO();
				System.out.println("--�����߰�--");
				System.out.print("�̸� : ");
				name = sc.next();
				System.out.print("���� : ");
				age = sc.nextInt();
				System.out.print("��ȭ : ");
				tel =sc.next();
				pd.setNames(name);
				pd.setAge(age);
				pd.setTel(tel);
				Person.al.add(pd);
				p.insert(pd);
				break;
			//���� ����
			case 2:
				System.out.println("������ �̸��� �Է��ϼ���");
				name =sc.next();
				if(p.delete(name)) {
					System.out.println("�����Ǿ����ϴ�.");
				}else {
					System.out.println("������ �̸� �����ϴ�.");
				}
				break;
				
			//���� ����
			case 3:
				p.info();
				break;

		}}
	}
}