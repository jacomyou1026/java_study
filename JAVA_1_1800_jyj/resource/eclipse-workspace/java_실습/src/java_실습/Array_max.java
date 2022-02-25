package java_실습;

import java.util.Scanner;

public class Array_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int Array[] =new int[5];
		int max=0;
		System.out.println("양수 5개를 입력하시오");
		for(int i=0;i<Array.length;i++){
			Array[i]=scan.nextInt();
			if(Array[i]>max) {
				max=Array[i];
			}
		}
		System.out.println("가장 큰 수는 "+max+"입니다.");
		scan.close();
		
	}

}
