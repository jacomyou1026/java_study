package ex4_calculator;

import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] args) {

		//키보드에서 정수를 두 개 입력받고
		//입력받은 값에 대한 사칙연산의 결과를 출력하시오

		//수1 : 5
		//수2 : 2
		//연산기호 : +
		//결과 : 7

		//수1 : 3
		//수2 : 7
		//연산기호 : *
		//결과 : 21
		Scanner sc = new Scanner(System.in);
		System.out.print("수1 : ");
		int su1 = sc.nextInt();
		
		System.out.print("수2 : ");
		int su2 = sc.nextInt();
		
		System.out.print("연산기호 : ");
		String op = sc.next();
		
		Calculator cal = new Calculator();
		cal.getResult(su1, su2, op);
		
	}//main
}








