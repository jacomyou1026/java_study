package ex1_if;

import java.util.Scanner;

public class 최대공약수 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("수1: ");
		int n1 =sc.nextInt();
		
		System.out.println("수2 :");
		int n2= sc.nextInt();
		int i = 0;
		for (i = n1; i >=1 ; i--) {
			if(n1%i==0&&n2%i==0) {
				break;
			}
		}
		if(i==1) {
			System.out.println("최대공약수가 없습니다.");
		}else {
			System.out.println("최대공약수 : "+i);
		}
	}
	
}
