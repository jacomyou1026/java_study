package ex2_exception;

import java.util.Scanner;

public class Ex4_TryCatch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		
		String str = "";
		
		try {
			
			str = sc.next();
			int n = Integer.parseInt(str);
			System.out.println("결과 : " + n);
			
		}catch (Exception e) {
			System.out.println(str + "은(는) 정수가 아닙니다");
			
		}
		
		
	}//main
}














