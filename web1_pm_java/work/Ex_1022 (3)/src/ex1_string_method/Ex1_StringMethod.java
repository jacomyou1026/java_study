package ex1_string_method;

public class Ex1_StringMethod {
	public static void main(String[] args) {
		
		//메서드 : 어떤 작업을 수행하기 위한 명령문들의 집합
		//반복적으로 사용되는 코드를 줄이기 위해서 사용한다
		String str = "Hong Gil Dong";
		int len = str.length();
		System.out.println( "문자열 str의 길이 : " + len );
		
		int res = str.indexOf('o');
		System.out.println( "맨 앞 o의 위치 : " + res );
		
		res = str.indexOf("Gil");
		System.out.println("문장 Gil의 시작 위치 : " + res);
		
		res = str.lastIndexOf('o');
		System.out.println("가장 뒤의 o의 위치 : " + res);
		
		char ch = str.charAt(6);
		System.out.println("6번째 위치의 문자 : " + ch);
		
		String str2 = str.substring(2, 8);
		System.out.println("잘라낸 문자열 : " + str2);
		
		String a = "   apple           ";
		String a2 = a.trim();//문장 맨앞과 뒤에 있는 의미없는 공백을 제거
		String b = "apple";
		if( a2.equals(b) ) {//a와 b의 값이 같은지 비교
			System.out.println("값이 같습니다");
		}
		
		String i1 = "apple";
		String i2 = "Apple";
		//대소문자를 따지지 않고 값을 비교해주는 메서드
		if( i1.equalsIgnoreCase(i2) ) {
			System.out.println("같습니다");
		}
		
		String number = "100";
		int num = Integer.parseInt( number );
		System.out.println(num + 10);
		
		//Wrapper클래스 : 기본자료형을 포장하고 있는 부모개념의 클래스
		//boolean  ->  Boolean
		//char -> Character
		//int -> Integer
		//byte -> Byte
		//short -> Short
		//long -> Long
		//float -> Float
		//double -> Double
	}//main
}























































