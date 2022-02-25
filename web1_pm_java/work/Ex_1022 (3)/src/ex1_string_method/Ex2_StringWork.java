package ex1_string_method;

import java.util.Scanner;

public class Ex2_StringWork {
	public static void main(String[] args) {
		
		//키보드에서 주민번호를 받은 후 아래와 같이 출력하시오
		//----------------------
		//주민번호(-포함) : 001211-4234567 
		//당신은 00년 12월 11일에 태어난 여자입니다
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호(-포함) : ");
		String jumin = sc.next();
		
		if( jumin.trim().length() != 14 || 
				jumin.trim().charAt(6) != '-') {
			
			System.out.println("주민번호를 올바르게 입력하세요");
			
		}else {
			
			String year = jumin.substring(0, 2);			
			String month = jumin.substring(2, 4);
			String day = jumin.substring(4, 6);
			String gender = ""; 
			char g = jumin.charAt(7);
			
			if( g % 2 == 1 ) {
				gender = "남자";
			}else {
				gender = "여자";
			}
			
			System.out.printf("당신은 %s년 %s월 %s일에 태어난 %s입니다", 
								year, month, day, gender );
		}
		
		//char를 int로 변경
		char ch = '9';
		String ss = "" + ch;
		int n = Integer.parseInt(ss);
		
	}//main
}























