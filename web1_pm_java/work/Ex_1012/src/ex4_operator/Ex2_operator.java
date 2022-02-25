package ex4_operator;

public class Ex2_operator {
	public static void main(String[] args) {
		//비교연산자
		//변수의 값을 비교하는 참과 거짓을 판단하는 연산자
		int n1 = 10;
		int n2 = 20;
		boolean res = n1<n2;
		System.out.println("<  : "+res);
		res = n1>=n2;
		System.out.println(">= : "+res);
		res = n1==n2;
		System.out.println("== : "+res);
		res = n1!=n2;
		System.out.println("!= : "+res);
		// < : 작다 : lt
		// > : 크다 : gt
		
		//증감 연산자
		//1씩 증가시키거나 1씩 감소시키는 연산자
		//선행증감과 후행 증감의 차이점!
		int a =10;
		System.out.println("a : "+ ++a);
		
		int b =10;
		System.out.println("b : "+b++);
		
	}
}
