package ex1_word_game;

import java.util.Scanner;

public class GameMain {
	public static void main(String[] args) {
		
		//정답을 가져온다
		Question q = new Question();
		
		String answer = q.getAnswer();
		
		//가져온 정답을 섞어서 문제로 만든다
		String question = q.getQuestion(answer);
		
		System.out.println("문제 : " + question);
		
		Scanner sc = new Scanner(System.in);
		
		while( true ) {
			System.out.print("정답 : ");
			String ans = sc.next();
			
			if( ans.equalsIgnoreCase( answer ) ) {
				System.out.println(ans + "정답!!");
				break;
				
			}else {
				System.out.println(ans + "오답...");
			}
		}
		
		
	}//main
}












