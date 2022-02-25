package java_실습;

import java.util.Scanner;

public class triangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수의 3개 입력>>");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		//삼각형이 되려면 가장 긴 변이 2변의 합보다 작아야 한다.
		if(num1<(num2+num3)||num2<(num1+num3)||num3<(num2+num1)) {
			System.out.println("삼각형을 만들 수 있다.");
		}else {
			System.out.println("삼각형을 만들 수 없다.");
			
		}
		
	}

}
