package ex3_casting;

public class Ex2_demotion {
	public static void main(String[] args) {
		
		//2. 디모션
		// - 작은 자료형에 큰 자료형을 대입하는 것(자동x)
		char a = 'A';
		int n = a+1;
		a = (char) n;
		System.out.println(a);
		
		float f = 5.5f;
		int n2 = 0;
		n2 =(int)f;
		System.out.println(n2);
	}
}
