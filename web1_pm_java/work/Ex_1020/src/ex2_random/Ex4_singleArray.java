package ex2_random;

import java.util.Random;

public class Ex4_singleArray {
	public static void main(String[] args) {
		//변수 money에 10~5000사이에 난수를 만든다.
		//단, 3450,2100과 같이 1의m자리는 반드시 0
		int money = 0;
//		while(true) {
//			money=new Random().nextInt(5000-10)+10;
//			if(money%10==0) {
//				System.out.println(money);
//				break;
//			}
//		}
//		money = new Random().nextInt(500)+1;
		money*=10;
		System.out.println("금액 : "+money);
		
		int[] coin = {500,100,50,10};
		int count=0;
		for (int i = 0; i < coin.length; i++) {
			int res = money/coin[i];
			if(res>0) {
				System.out.println(coin[i]+"원: "+res);
				money%=coin[i];
			}
			
			
		}
			
		
	}
}
