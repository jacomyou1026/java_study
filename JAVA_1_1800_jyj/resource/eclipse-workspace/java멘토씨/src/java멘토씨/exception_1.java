package java���侾;

public class exception_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int []a= {2,0,0};
			int b=4;
			int c=b/a[2];
			System.out.println(c);
		}catch(ArithmeticException e){
			System.out.println("������� �߻�");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ���� ���� �߻�");
		}
		System.out.println("���� ó�� ���� ��");
	}
}
