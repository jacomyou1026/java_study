package ex1_string_method;

import java.util.Scanner;

public class Ex4_StringWork {
	public static void main(String[] args) {
		
		//키보드에서 이메일을 입력받고, @앞의 문장의 길이가
		//6미만이거나 10초과일때는 '잘못된 형식'이라는 메시지를 출력
		
		//abc@n.com
		//잘못된 형식입니다
		
		//aabbcc@k.com
		//aabbcc님 로그인 성공
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일 : ");
		String email = sc.next();
		
		//abc@n.com
		String len = email.substring(0, email.indexOf('@'));
		
		if( len.length() < 6 || len.length() > 10 ) {
			System.out.println("잘못된 형식");
			
		}else {
			System.out.println(len + "님 환영합니다");
			
		}
		
	}//main
}



















