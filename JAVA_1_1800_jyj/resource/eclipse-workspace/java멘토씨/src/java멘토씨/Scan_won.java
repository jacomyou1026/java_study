package java멘토씨;

import java.util.Scanner;

public class Scan_won {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>>");
		int num = scan.nextInt();
		double  dollar =num/1100;
		System.out.println(num+"원은$"+dollar+"입니다.");
		scan.close();
		
	}

}
