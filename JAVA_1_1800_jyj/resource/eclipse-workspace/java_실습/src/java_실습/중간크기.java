package java_실습;

import java.util.Scanner;

public class 중간크기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 3개 입력 >>");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		if(num1<num2&&num2<num3) {System.out.println("중간값:"+num2);}
		else if(num2<num1&&num1<num3) {System.out.println("중간값:"+num1);}
		else {
			{System.out.println("중간값:"+num3);}
		}
		scan.close();
	}

}
