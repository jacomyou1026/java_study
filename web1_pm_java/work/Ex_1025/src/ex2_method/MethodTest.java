package ex2_method;

public class MethodTest {
	
	public void test() {
		System.out.println("------------------");
	}
	
	public void test2( int n ) {
		System.out.println("���� ���̴� " + n + "�� �Դϴ�");
	}
	
	public void exam( int n ) {
		n += 100;
		System.out.println("n : " + n);
	}
	
	public int exam2( int s ) {
		
		s += 50;
		System.out.println("s : " + s);
		
		//���������� ���� ��ȯ�ϱ� ���� return
		//return : ���� ȣ���ߴ� ������ �� �Ѱ��� ���� ������ �ǵ��ư��� Ű����
		return s;
		
	}
	
}












