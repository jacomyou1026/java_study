package ex2_random;

import java.util.Random;

public class Ex_random {
	public static void main(String[] args) {
		//난수 만들기
		//new Random().nextInt(발생시킬 난수의 범위)+적운 슈;
		//new Random().nextInt(큰수-작은수+1)+적운 슈;
		int r = new Random().nextInt(32423-1176+1)+1176;
		System.out.println(r);
		
		
	}
}
