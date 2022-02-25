package java_실습;

import java.util.Scanner;

public class ten_equal_one {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");
		int num = scan.nextInt();
		if(num>=10&&num<100) {
			
			if(num/10==num%10) {
				System.out.println("yes! 10의 자리와 1의 자리가 같습니다.");
			}else {
				System.out.println("no! 10의 자리와 1의 자리가 다릅니다.");
			}
		}else {
			System.out.println("2자리의 정수가 아닙니다.");
		}
		scan.close();
		
	}
}
