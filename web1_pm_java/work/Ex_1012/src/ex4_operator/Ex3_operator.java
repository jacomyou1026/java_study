package ex4_operator;

public class Ex3_operator {
	public static void main(String[] args) {
		//삼항 연산자
		//하나의 조건을 정의하고 그 조건의 결과에 따라 서로 다른
		//값을 출력(대입)할 수 있도록 해 주는 연산자
		int a =10;
		int b =15;
		boolean rse = ++a >= b ? true:false;
		for (int i = 0; i < 10; i++) {
			String res = i%2==0?"짝수입니다." :"홀수입니다.";
			System.out.println(i+" = "+res);
		}
		
		System.out.println("-----------");
		//논리 연산자
		//비교연산자가 두 개 이상 있을 때 사이를 연결해주는 연산자
		//&& 연산자 : 앞의 연산이 거짓이면 뒤쪽 연산 수행x
		
		int age =30;
		int limit=35;
		rse = limit-age >=5 &&age >30;
		System.out.println(rse);
		
		rse = limit -age >=5&&(age+=2)>limit;
		System.out.println(rse);
		System.out.println(age);
		rse = limit -age <5&&(age+=2)>limit;
		System.out.println(rse);
		
		//|| (or)연산자 : 앞의 연산이 참이면 뒤쪽 연산을 수행x
		//
		int n1 =10;
		int n2 = 20;
		rse = (n1+=10)>20||n2-10==11;
		System.out.println(rse);
		
		//!(not)연산자 : 변수앞에 붙여서 참과 거짓을 바꾸는 연산자
		System.out.println("------------------");
		boolean test = false;
		System.out.println(!test);
		
		test =!test;
		System.out.println(test);
		System.out.println("---------------");
		a =10;
		b=12;
		char test1= ++a>=b||2+(b-5)<=b&&13-b>=0&&(a+=b)-(b%a)>10?'0':'X';
		System.out.println(test1);
		
		
				
				
		
	}
}
