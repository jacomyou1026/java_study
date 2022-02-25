package ex5_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3_ArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList ar = new ArrayList<>();
		System.out.println("끝내기 : q");
		outer: while (true) {

			System.out.print("값 : ");
			String str = sc.next();

			for (int i = 0; i < ar.size(); i++) {
				if (ar.get(i).equals(str)) {
					System.out.println("중복된 값입니다.");
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
