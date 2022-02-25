package ex1_string_method;

import java.util.Scanner;

public class Ex5_StringWork {
	public static void main(String[] args) {
		
		//키보드에서 받은 값이 회문수인지 판단하기
		
		//입력 : a123a
		//a123a 은(는) 회문수가 아닙니다
		
		//입력 : ab1c1ba
		//ab1c1ba 은(는) 회문수 입니다
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String ori = sc.next();//원본
		String rev = "";//원본을 뒤집어서 저장할 변수
		
		for( int i = ori.length()-1; i >= 0; i-- ) {
			//원본 문자열을 뒤집어서 rev변수에 저장
			rev += ori.charAt(i);
			
		}//for
		
		if( ori.equals(rev) ) {
			System.out.println(ori + "은(는) 회문수");
		}else {
			System.out.println(ori + "은(는) 안회문수");
		}
		
	}//main
}













