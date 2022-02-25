package ex2_value_type;

public class Ex1_ValueType {
	public static void main(String[] args) {
		
		//기본자료형 : 값을 저장하기 위한 그릇과 같은 개념
		//논리형 : boolean
		//문자형 : char
		//정수형 : byte ..... 1byte( -128 ~ 127 )
		//		  short .... 2byte( -32768 ~ 32767 )
		//		  int ...... 4byte( -21억 ~ 21억 )
		//		  long ..... 8byte( -900경 ~ 900경 ) 
		//실수형 : float ..... 4.x byte
		//		  double .... 8.x byte
		
		//변수 : 값을 저장하기 위한 공간
		//변수 선언 규칙
		//1) 변수는 숫자로 시작할 수 없다
		//2) _를 제외하고 특수문자를 사용할 수 없다
		//3) 한글은 사용하지 말자!!
		//4) 변수명은 소문자로 시작
		
		//자료형 변수명;(선언)
		//변수명 = 값;(대입)
		//자료형 변수명 = 값;(선언과 대입을 동시에. 초기화)
		//--------------------------------------
		
		//논리형
		//논리형은 true, false즉, 사실이다와 거짓이다의 두가지 값 만을 저장할 수 있다.
		boolean b;
		//b = 100; <-- 자료형 타입과 맞지않는 값이 대입되면 오류
		b = false;
		System.out.println("b:" + b);
		
		b = true;
		System.out.println("b:" + b);
		
		System.out.println("--------------------------");
		
		//문자형 : 홑따옴표 안에 한글자만 저장 가능한 자료형
		char c = 'A';
		System.out.println("c:" + c);
		
		char c2 = 66 + 1;
		c2 = 'D' + 2;
		System.out.println( "c2:" + c2 );
		
		System.out.println("---------------------------");
		
		//정수형
		byte b1 = 127;
		short s = 32767;
		
		int n = 2100000000;
		long lo = 2200000000L;
		
		System.out.println( n );
		System.out.println( lo );
		
		System.out.println("-------------------");
		
		//실수형 : 소수점을 포함하고 있는 값을 저장하고자 할 때 사용하는 자료형
		float f1 = 3.14f;
		double d1 = 3.14;
		
		f1 = 100;
		d1 = 100;
		
		System.out.println( f1 );
		System.out.println( d1 );
	}//main
}


























