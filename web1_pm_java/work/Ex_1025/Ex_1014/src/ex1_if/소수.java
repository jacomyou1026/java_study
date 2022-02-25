package ex1_if;

import java.util.Scanner;

public class 소수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수 : ");
		int n =sc.nextInt();
		int i=0;
		for ( i = 2; i <=n; i++) {
			if(n%i==0) {
				break;
			}
		}
		if(i==n) {
			System.out.println(n+"은 소수입니다.");
		}else {
			System.out.println(n+"은 소수가 아닙니다.");
		}
		
	}
}
