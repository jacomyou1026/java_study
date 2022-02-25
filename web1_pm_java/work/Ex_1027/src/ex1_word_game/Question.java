package ex1_word_game;

import java.util.Random;

public class Question {

	private String[] strArr = {"HOPE", "APPLE", "DOCTOR"};
	static String shake = "";//문제용 문자열
	
	//정답 반환 메서드
	public String getAnswer() {
		int idx = new Random().nextInt(strArr.length);
		return strArr[idx];
	}
	
	//문제를 만드는 메서드
	public String getQuestion(String s) {//view
		
		//정답 단어를 섞이지 않도록 정렬하기 위한 배열
		int[] inArr = new int[s.length()];
		
		//만들어진 inArr배열의 각 방에 겹치지 않는 난수를 발생시켜 넣는다
		outer : for( int i = 0; i < inArr.length; ) {
			
			inArr[i] = new Random().nextInt(s.length());
			
			//중복값을 비교하는 반복문
			for( int j = 0; j < i; j++ ) {
				
				if( inArr[i] == inArr[j] ) {
					continue outer;
				}
				
			}//inner
			
			i++;
		}//outer
		
		for( int i = 0; i < s.length(); i++ ) {
			
			shake += s.charAt( inArr[i] );
		}
		
		return shake;
		
	}//getQuestion()
}













