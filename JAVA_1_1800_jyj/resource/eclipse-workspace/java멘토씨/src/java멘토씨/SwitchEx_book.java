package java멘토씨;

import java.util.Scanner;

public class SwitchEx_book {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//일년동안 읽은 책 수에 따라 멘트를 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("일년간 몇권을 책을 읽으셨나요???");
		int book =scan.nextInt();
		book = book/10;
		switch(book) {
		case 0: // 10번 미만
			System.out.println("조금 더 노력하세요");
			break;
		case 1://10<=book<20
			System.out.println("책 읽는 것을 즐기시는 분이네요!");
			break;
		case 2: //20<=book<30 
			System.out.println("책을 사랑하시는분이네요");
			break;
		default://book>=3o
			System.out.println("당신은 다독왕입니다.");
		}
		
		
	}

}
