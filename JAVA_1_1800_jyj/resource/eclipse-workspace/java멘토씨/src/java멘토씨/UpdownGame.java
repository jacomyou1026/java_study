package java멘토씨;

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
			System.out.println("3번의 기회가 주어집니다.");
			System.out.println("숫자를 입력해주세요 끝내고 싶다면 'q'를 눌러주세요");
			while (true) {
				int i = 0;
				System.out.println(low + "~" + high);
				System.out.print((i + 1) + ">>");
				unum = scan.nextInt();
				i++;
				if (unum > high || unum < low) {
					System.out.println("범위에 벗어났습니다.");
				} else {
					if (rnum == unum) {
						System.out.println("정답입니다.");
						System.out.println(rnum);
						i++;
						break;
					} else {
						System.out.println("틀렸습니다.");
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
					System.out.println("현재" + count + "번이 남았습니다.");
				}
				//q를 누르면 나가기
				if (scan.next().equals("q")) {
					System.out.println("정답은" + rnum + "이였습니다.");
					break;
				}

				if (count == 0) {
					System.out.println("기회를 다 쓰셨습니다.");
					System.out.println("정답은" + rnum + "이였습니다.");
					break;
				}
			}
			System.out.println("한게임 더?(y/n)");
			answer = scan.next();
			if (answer.equals("y")) {
				count = 10;
			} else if (answer.equals("n")) {
				System.out.println("게임을 종료합니다.");
				break;
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
		}

	}

}
