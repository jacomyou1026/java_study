package ex5_static;

public class Bank {

	//static : �ش� Ŭ������ ���� ��ü�� �ƹ��� ���� �����Ǿ
	//�޸𸮿� ���� �Ѱ��� ��������� �ϱ� ���� Ű����
	
	private String point;
	private String tel;
	static float interest;
	
	public Bank( String point, String tel ) {
		this.point = point;
		this.tel = tel;
		interest = 10.0f;
	}
	
	public void bankInfo() {
		System.out.println("���� : " + point);
		System.out.println("��ȭ : " + tel);
		System.out.println("������ : " + interest);
		System.out.println("---------------------------");
	}
	
}













