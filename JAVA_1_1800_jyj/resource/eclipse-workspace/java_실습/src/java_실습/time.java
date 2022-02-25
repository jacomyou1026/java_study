package java_실습;

import java.util.Scanner;

public class time {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("초 단위의 정수를 입력하세요");
		int time = scan.nextInt();
		int hour = (time/60)/60;
		int minute=(time/60)%60;
		int second= time%60;
		
		System.out.println(time+"초는");
		System.out.print(hour+"시간");
		System.out.print(minute+"분");
		System.out.print(second+"초 입니다.");
	}

}
