package ex3_casting;

public class Ex1_promotion {
	public static void main(String[] args) {
		//ĳ����(����ȯ)
		//1.���θ�� : ū �ڷ����� ���� �ڷ����� ���ԵǴ� ��(�ڵ����� �̷�� ��)
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









































