package java_실습;

import java.util.Scanner;

public class moeney {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하세오>>");
		int money = scan.nextInt();
		int mon_5=0,mon_1=0,won_1000=0,won_500=0,won_100=0,won_50=0,won_10=0,won_1=0;
		while (money!=0) {
			if (money >= 50000) {
				mon_5++;
				money -= 50000;
			} else if (money>=10000) {
				mon_1++;
				money -= 10000;

			} else if (money>=1000) {
				won_1000++;
				money -= 1000;

			} else if (money>=500) {
				won_50++;
				money -= 500;

			} else if (money>=100) {
				won_100++;
				money -= 100;

			} else if (money >=50) {
				won_50++;
				money -= 50;

			} else if (money>=10) {
				won_10++;
				money-=10;
			}else {				
				won_1=money;
				money=0;
			}
		}
		System.out.println("오만원: "+mon_5+"원 ");
		System.out.println("만 원: "+mon_1+"원");
		System.out.println("천원: "+won_1000+"원");
		System.out.println("오백원:"+won_500+"원");
		System.out.println("백원: "+won_100+"원");
		System.out.println("오십원: "+won_50+"원");
		System.out.println("십원 :"+won_10+"원");
		System.out.println("일원: "+won_1+"원");
		
		/*
		 * int num=scan.nextInt(); System.out.println("50000won"+num/50000+"mae");
		 * num%=50000; System.out.println("10000won"+num/10000+"mae"); num%=10000;
		 * System.out.println("1000won"+num/1000+"mae"); num%=1000;
		 * System.out.println("100won"+num/100+"mae"); num%=100;
		 * System.out.println("50won"+num/50+"mae"); num%=50;
		 * System.out.println("10won"+num/10+"mae"); num%=10;
		 * System.out.println("1won"+num/1+"mae"); scan.close(); }
		 */
		
		
		
		/*int[] coin = {50000, 10000, 1000, 500, 100, 50, 10, 1}; 
		Scanner s=new Scanner(System.in); System.out.println("금액을 입력하시오>>"); 
		int num=s.nextInt(); 
		for (int i=0; i<coin.length; i++) { 
			System.out.println(coin[i]+"원:" + num/coin[i]); 
			num%= coin[i]; }*/


	}
	
	
	
}
