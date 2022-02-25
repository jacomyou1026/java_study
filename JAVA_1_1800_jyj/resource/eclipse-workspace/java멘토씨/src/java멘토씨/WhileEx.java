package java멘토씨;

import java.util.Scanner;
public class WhileEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String answer="y";
		int count =0;
		while(answer.equals("y")) {
			System.out.println("음악을 재생하시겠습니까?(y)");
			answer =scan.nextLine();
			if(answer.equals("y")) {
				System.out.printf("음악을 %d번 재생하였습니다.\n",++count);
			}
		}
		System.out.println("재생 종료");
	}

}
