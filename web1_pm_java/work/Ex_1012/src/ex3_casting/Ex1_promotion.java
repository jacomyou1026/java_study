package ex3_casting;

public class Ex1_promotion {
	public static void main(String[] args) {
		//캐스팅(형변환)
		//1.프로모션 : 큰 자료형에 작은 자료형이 대입되는 것(자동으로 이루어 짐)
		double d = 100.5; //8byte
		int n = 100;//4byte
		d = n;
		System.out.println(d);
		
		System.out.println("---------------------");
		
		char c = 'A';//2byte
		n = 30;//4byte
		n = c;
		System.out.println(n);
		
	}//main
}









































