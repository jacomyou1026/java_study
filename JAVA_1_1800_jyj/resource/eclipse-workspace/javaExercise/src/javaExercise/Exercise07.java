package javaExercise;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum=0;
		int[] scores =null;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.�л���| 2.�����Է�| 3.��������Ʈ|4.�м�|5.����");
			System.out.println("-----------------------------------------");
			System.out.print("����>");
			int selec = scan.nextInt();
			if(selec==1) {
				System.out.print("�л���>");
				studentNum = scan.nextInt();
				scores = new int [studentNum];
			}
			else if(selec==2) {
				for(int i=0;i<studentNum;i++) {
					System.out.print("scores["+i+"]>");
					scores[i]=scan.nextInt();
				}
				
			}
			else if(selec ==3) {
				for(int i=0;i<studentNum;i++) {
					System.out.println("scores["+i+"]: "+scores[i]);
				}
			}
			else if(selec ==4) {
				int max=0;
				int sum=0;
				for(int i=0;i<scores.length;i++) {
					if (scores[i]>max) {
						max=scores[i];
					}
					sum+=scores[i];
					
				}
				System.out.println("�ְ�����: "+max );
				System.out.println("�������: "+sum/scores.length);				
			}
			else if(selec==5) {
				run = false;
			}
			else {
				System.out.println("�߸��Է��ϼ̽��ϴ�. 1~5���� ���ڸ� �Է��ϼ���");
				continue;
			}
			
		}
		System.out.println("���α׷� ����");
	}

}
