package java���侾;

import java.util.Random;
import java.util.Scanner;

public class UpdownGame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	
		while (true) {
			Random ran = new Random();
			int rnum = ran.nextInt(100) + 1;
			int low = 1;
			int high = 100;
			int unum = -1;
			int count = 3;
			String answer;
			System.out.println("3���� ��ȸ�� �־����ϴ�.");
			System.out.println("���ڸ� �Է����ּ��� ������ �ʹٸ� 'q'�� �����ּ���");
			while (true) {
				int i = 0;
				System.out.println(low + "~" + high);
				System.out.print((i + 1) + ">>");
				unum = scan.nextInt();
				i++;
				if (unum > high || unum < low) {
					System.out.println("������ ������ϴ�.");
				} else {
					if (rnum == unum) {
						System.out.println("�����Դϴ�.");
						System.out.println(rnum);
						i++;
						break;
					} else {
						System.out.println("Ʋ�Ƚ��ϴ�.");
						count--;
						i++;
						if (rnum > unum) {
							System.out.println("UP!!");
							low = unum;

						} else if (rnum < unum) {
							System.out.println("Down!!");
							high = unum;
						}
					}
					System.out.println("����" + count + "���� ���ҽ��ϴ�.");
				}
				//q�� ������ ������
				if (scan.next().equals("q")) {
					System.out.println("������" + rnum + "�̿����ϴ�.");
					break;
				}

				if (count == 0) {
					System.out.println("��ȸ�� �� ���̽��ϴ�.");
					System.out.println("������" + rnum + "�̿����ϴ�.");
					break;
				}
			}
			System.out.println("�Ѱ��� ��?(y/n)");
			answer = scan.next();
			if (answer.equals("y")) {
				count = 10;
			} else if (answer.equals("n")) {
				System.out.println("������ �����մϴ�.");
				break;
			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}

	}

}
