package ex1_word_game;

import java.util.Scanner;

public class GameMain {
	public static void main(String[] args) {
		
		//������ �����´�
		Question q = new Question();
		
		String answer = q.getAnswer();
		
		//������ ������ ��� ������ �����
		String question = q.getQuestion(answer);
		
		System.out.println("���� : " + question);
		
		Scanner sc = new Scanner(System.in);
		
		while( true ) {
			System.out.print("���� : ");
			String ans = sc.next();
			
			if( ans.equalsIgnoreCase( answer ) ) {
				System.out.println(ans + "����!!");
				break;
				
			}else {
				System.out.println(ans + "����...");
			}
		}
		
		
	}//main
}












