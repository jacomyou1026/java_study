package java���侾;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5���� ������ ���� 2���� �迭
		Scanner scan = new Scanner(System.in);
		int score[][] = new int[4][3];
		String subject[] = { "����", "����", "����" };
		for (int j = 0; j < 4; j++) {

			System.out.println((j + 1) + "�� �л� ����---");
			for (int i = 0; i < 3; i++) {
				System.out.print(subject[i] + ":");
				score[0][i] = scan.nextInt();
			}
		}
		
		
		//���
		for(int i=0;i<3;i++) {
			System.out.print("\t"+subject[i]+"\t");	
		}
		for(int j=0;j<4;j++) {
			System.out.println((j+1)+"��:\t");			
			for(int i=0;i<score.length;i++) {
				System.out.println(score[j][i]+"\t");
			}
			
		}
		
		
		
		 
	}

}
