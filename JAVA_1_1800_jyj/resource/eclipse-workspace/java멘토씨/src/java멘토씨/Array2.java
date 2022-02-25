package java멘토씨;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5개의 변수를 묶는 2차원 배열
		Scanner scan = new Scanner(System.in);
		int score[][] = new int[4][3];
		String subject[] = { "국어", "영어", "수학" };
		for (int j = 0; j < 4; j++) {

			System.out.println((j + 1) + "번 학생 점수---");
			for (int i = 0; i < 3; i++) {
				System.out.print(subject[i] + ":");
				score[0][i] = scan.nextInt();
			}
		}
		
		
		//출력
		for(int i=0;i<3;i++) {
			System.out.print("\t"+subject[i]+"\t");	
		}
		for(int j=0;j<4;j++) {
			System.out.println((j+1)+"번:\t");			
			for(int i=0;i<score.length;i++) {
				System.out.println(score[j][i]+"\t");
			}
			
		}
		
		
		
		 
	}

}
