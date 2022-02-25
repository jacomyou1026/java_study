package java멘토씨;

import java.util.Random;

public class Pokemon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		System.out.println("☆☆☆☆☆ Random Choosing a Pokemon☆☆☆☆☆");
		System.out.println("1. 피카츄");
		System.out.println("2. 꼬부기");
		System.out.println("3. 이상해씨");
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		int mypokemon = ran.nextInt(3)+1; // 1~3
		System.out.println("선택된 번호 :"+mypokemon);
		switch(mypokemon) {
		case 1: 
			System.out.println("피카츄 선택!! 백만볼트!!");
			break;
		case 2: 
			System.out.println("꼬북기 선택!!물대포!!");
			break;
		case 3: 
			System.out.println("이상해씨 선택! 덩쿨쓰!!!");
			break;
		}
		
		
		
		

	}

}
