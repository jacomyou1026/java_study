package java���侾;

public class finally_1 {
	public static void main(String[] args) {
		int a=0;
		int b=2;
		try {
			int c=b/a;
			System.out.println("�ܺη� ����");
		}catch(ArithmeticException e) {
		System.out.println("�����߻�");	
		}
		finally {
			System.out.println("������ ��������");
		}
	}
}
