package java멘토씨;
import java.util.*;
public class switch_Traffic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("☆☆☆☆신호등 프로그램☆☆☆☆☆");
		System.out.println("빨간불:1 노랑불:2 초록불:3");
		System.out.println("신호:");
		int sign = sc.nextInt();
		switch(sign) {
		case 1:
			System.out.println("멈추시오");
			break;
		case 2:
			System.out.println("break밟으세요");
			break;
		case 3:
			System.out.println("출발하세요");
			break;
			default : System.out.println("사용자가 잘못 입력하셨습니다.");
		}
		 
	}

}
