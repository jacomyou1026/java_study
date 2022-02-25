package java멘토씨;

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
			System.out.println("☆☆☆☆☆☆☆cafe☆☆☆☆☆☆");
			System.out.println("(1) 주문하기");
			System.out.println("(2) 취소하기");
			System.out.println("(3) 결제하기");
			System.out.println("(4) 끝내기");
			int push = scan.nextInt();
			System.out.println("입력:" + push);
			switch (push) {
			case 1:
				System.out.println("---Menu---");
				System.out.println("1. 아메리카노\t3800원");
				System.out.println("2. 에스프레소\t2400원");
				System.out.println("3. 카페라떼\t4300원");
				System.out.println("4. 밀크티\t\t5100원");
				System.out.println("주문할 메뉴번호:");
				int OrderNum = scan.nextInt();
				if (OrderNum == 1) {
					MenuName = "아메리카노";
					price = 3800;
				} else if (OrderNum == 2) {
					MenuName = "에스프레소";
					price = 2400;
				} else if (OrderNum == 3) {
					MenuName = "카페라떼";
					price = 4200;

				} else if (OrderNum == 4) {
					MenuName = "밀크티";
					price = 5100;

				} else {
					System.out.println("잘못입력하셨습니다.");
					continue;
				}
				orderList[count] = MenuName;
				count++;
				total += price;
				System.out.println("주문한 메뉴는 " + MenuName + "입니다.");
				System.out.println("주문한 메뉴의 가격은 " + price + "입니다.");
				System.out.println("주문한 메뉴의 총 가격은 " + total + "입니다.");
				System.out.println("주문한 메뉴의 갯수" + count + "입니다.");
				break;
			case 2:
				System.out.println("---주문한 메뉴 리스트----");
				for (int i = 0; i < count; i++) {
					System.out.println((i + 1) + "." + orderList[i]);
				}
				System.out.print("취소할 메뉴번호:");
				int cancelNum = scan.nextInt();
				if (1 <= cancelNum && cancelNum <= count) {
					String delMenu = orderList[cancelNum - 1];
					System.out.println(delMenu + " 메뉴삭제!");
					for (int i = cancelNum - 1; i < count; i++) {
						orderList[i] = orderList[i + 1];
					}
					if (delMenu.equals("아메리카노")) {
						total -= 3800;
					} else if (delMenu.equals("에소프레소")) {
						total -= 2400;
					} else if (delMenu.equals("카페라떼")) {
						total -= 4300;
					} else if (delMenu.equals("밀크티")) {
						total -= 5100;
					}
					count--;
				}
				break;
			case 3:
				System.out.println("결제할 금액:" + total + "원");
				System.out.println("지불할 금액:");
				int money = scan.nextInt();
				if (money < total) {
					System.out.println("잔돈이" + (total - money) + "부족합니다.");
					continue;
				} else {
					System.out.println("잔돈:" + (money - total) + "원");
					total = 0;
					for (int i = 0; i < 5; i++) {
						orderList[i] = "";
					}
					count = 0;
				}
			case 4:
				exit = -1;
				System.out.println("반복종료");
				break;
				
			default:
				System.out.println("잘못입력하셨습니다.");
				continue;

			}
			if(exit==-1) {
				break;
			}
		}
	}
}
