package ex2_exception;

import java.util.Scanner;

public class Ex3_TryCatch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		
		try {
			int n = sc.nextInt();
			System.out.println("결과 : " + n);
			
		}catch (Exception e) {
			System.out.println("정수만 입력 가능");
			
		}
		
	}//main
}












