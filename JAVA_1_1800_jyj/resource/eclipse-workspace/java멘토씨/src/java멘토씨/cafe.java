package java���侾;

import java.util.Scanner;

public class cafe {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int total = 0;
		String MenuName = " ";
		String orderList[] = new String[5];
		int price = 0;
		int exit = 0;
		while (true) {
			System.out.println("�١١١١١١�cafe�١١١١١�");
			System.out.println("(1) �ֹ��ϱ�");
			System.out.println("(2) ����ϱ�");
			System.out.println("(3) �����ϱ�");
			System.out.println("(4) ������");
			int push = scan.nextInt();
			System.out.println("�Է�:" + push);
			switch (push) {
			case 1:
				System.out.println("---Menu---");
				System.out.println("1. �Ƹ޸�ī��\t3800��");
				System.out.println("2. ����������\t2400��");
				System.out.println("3. ī���\t4300��");
				System.out.println("4. ��ũƼ\t\t5100��");
				System.out.println("�ֹ��� �޴���ȣ:");
				int OrderNum = scan.nextInt();
				if (OrderNum == 1) {
					MenuName = "�Ƹ޸�ī��";
					price = 3800;
				} else if (OrderNum == 2) {
					MenuName = "����������";
					price = 2400;
				} else if (OrderNum == 3) {
					MenuName = "ī���";
					price = 4200;

				} else if (OrderNum == 4) {
					MenuName = "��ũƼ";
					price = 5100;

				} else {
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
					continue;
				}
				orderList[count] = MenuName;
				count++;
				total += price;
				System.out.println("�ֹ��� �޴��� " + MenuName + "�Դϴ�.");
				System.out.println("�ֹ��� �޴��� ������ " + price + "�Դϴ�.");
				System.out.println("�ֹ��� �޴��� �� ������ " + total + "�Դϴ�.");
				System.out.println("�ֹ��� �޴��� ����" + count + "�Դϴ�.");
				break;
			case 2:
				System.out.println("---�ֹ��� �޴� ����Ʈ----");
				for (int i = 0; i < count; i++) {
					System.out.println((i + 1) + "." + orderList[i]);
				}
				System.out.print("����� �޴���ȣ:");
				int cancelNum = scan.nextInt();
				if (1 <= cancelNum && cancelNum <= count) {
					String delMenu = orderList[cancelNum - 1];
					System.out.println(delMenu + " �޴�����!");
					for (int i = cancelNum - 1; i < count; i++) {
						orderList[i] = orderList[i + 1];
					}
					if (delMenu.equals("�Ƹ޸�ī��")) {
						total -= 3800;
					} else if (delMenu.equals("����������")) {
						total -= 2400;
					} else if (delMenu.equals("ī���")) {
						total -= 4300;
					} else if (delMenu.equals("��ũƼ")) {
						total -= 5100;
					}
					count--;
				}
				break;
			case 3:
				System.out.println("������ �ݾ�:" + total + "��");
				System.out.println("������ �ݾ�:");
				int money = scan.nextInt();
				if (money < total) {
					System.out.println("�ܵ���" + (total - money) + "�����մϴ�.");
					continue;
				} else {
					System.out.println("�ܵ�:" + (money - total) + "��");
					total = 0;
					for (int i = 0; i < 5; i++) {
						orderList[i] = "";
					}
					count = 0;
				}
			case 4:
				exit = -1;
				System.out.println("�ݺ�����");
				break;
				
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				continue;

			}
			if(exit==-1) {
				break;
			}
		}
	}
}
