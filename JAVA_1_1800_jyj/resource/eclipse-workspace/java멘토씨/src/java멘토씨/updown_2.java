package java멘토씨;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class updown_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int low,high;
		int card;
		Random ran = new Random();
		while(true) {
			int i=0;
			low=0;
			high =99;
			card = ran.nextInt(100)+1;
			System.out.println("up&down게임입니다. 숨겨진 수를 마주어 보세요");
			while(true) {
				System.out.println(low+"~"+high);
				System.out.println(i+1+">>");
				int n=0;
				
				try {
					n=scan.nextInt();
				}catch(InputMismatchException e) {
					System.out.println("정수만 입력하셔야 합니다.");
					scan.nextLine();
					continue;
				}
				if(n>high||n<low) {
					System.out.println("범위에 벗어났습니다.");
				}else {
					if(n==card) {
						System.out.println("맞습니다.");
						break;
					}
					else if(n>card) {
						System.out.println("더 낮게");
						high =n;
					}
					else {
						System.out.println("더 높게");
						low=n;
					}
				}
				i++;
			}
			System.out.println("다시 하겠습니까>>(y/n)");
			if(scan.nextLine().equals("n")) {
				break;
			}
			scan.close();
		}
	}

}
