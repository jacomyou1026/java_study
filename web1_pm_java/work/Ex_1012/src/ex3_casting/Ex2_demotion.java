package ex3_casting;

public class Ex2_demotion {
	public static void main(String[] args) {
		
		//2. ����
		// - ���� �ڷ����� ū �ڷ����� �����ϴ� ��(�ڵ�x)
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
