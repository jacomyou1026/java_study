package ex5_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3_ArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList ar = new ArrayList<>();
		System.out.println("������ : q");
		outer: while (true) {

			System.out.print("�� : ");
			String str = sc.next();

			for (int i = 0; i < ar.size(); i++) {
				if (ar.get(i).equals(str)) {
					System.out.println("�ߺ��� ���Դϴ�.");
					continue outer;
				} else {
					break;
				}
			}

			ar.add(str);
			System.out.println(ar);
		}
	}
}
