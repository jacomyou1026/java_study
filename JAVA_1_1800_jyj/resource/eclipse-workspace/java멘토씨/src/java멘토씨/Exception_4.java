package java���侾;

public class Exception_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("�ܺ� try....");
			try {
				System.out.println("���� try....");
				Exception e = new Exception("���̷�");
				throw e;
			}
			catch(Exception e) {
				System.out.println("���� try-catch exception:"+e);
				System.out.println("���ܴ����� �� ����:");
				throw e;
			}
			finally {
				System.out.println("finally ���� ���");
			}
		}catch(Exception e) {
			System.out.println("�ܺ� try-cathch exception:"+e);
		}
		System.out.println("����");
	}

}
