package java멘토씨;

import java.util.Random;

public class Random_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Random ran1 = new Random(2);
		Random ran2 = new Random(2);
		System.out.println(System.currentTimeMillis());
		for(int i =0;i<5;i++) {
			System.out.println("기본 생성자:"+ran.nextInt()); 
		}
		for(int i =0;i<5;i++) {
			System.out.println("ramdon2:"+i+"번째 값"+ran1.nextInt()); 
		}
		for(int i =0;i<5;i++) {
			System.out.println("ramdon3:"+i+"번째 값"+ran2.nextInt()); 
		}
		
	}

}
