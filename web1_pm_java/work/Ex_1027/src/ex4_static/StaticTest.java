package ex4_static;

public class StaticTest {
	
	String str1 = "�������";
	static String str2 = "����ƽ ����";
	
	public void test() {
		str1 = "�� ���� ����";
		
		//�Ϲ����� �޼��忡���� static������ ������ ������ ����� �� �ִ�.
		str2 = "���� ���� ������";
	}
	
	public static void test2() {
		
		//static�޼��� ������ �Ϲ� ��������� �����ؼ� �� �� ����
		//str1 = "���� ��¼��?";
		str2 = "���� ���� �ɱ�?";

	}
	
}


















