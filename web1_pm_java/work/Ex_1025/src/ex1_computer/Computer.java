package ex1_computer;

public class Computer {
	//Ŭ������ ���� ���
	//�Ӽ�, ����, ���
	//�޼���, ���, �Լ�
	
	private String company = "apple";
	int ssd = 200;
	int ram = 512;
	String graphic = "intel";
	String color = "white";
	
	//��ǻ���� ������ ������ �޼���
	//�޼��� : ��� �۾��� �����ϱ� ���� ��ɹ����� ����
	public void myPc() {
		System.out.println("brand : " + company);
		System.out.println("ssd : " + ssd);
		System.out.println("ram : " + ram);
		System.out.println("graphic : " + graphic);
		System.out.println("color : " + color);
		System.out.println("-----------------------");
	}
	
	//�޼����� ����
	//����������   ��ȯ��    �޼����
	//public     void     myPc( �Ķ����(����,�Ű�����,�ƱԸ���)  ){ �޼���ȣ��� ���࿵�� }
	
	//����������
	//1.public : ���� ������Ʈ ���� ��� Ŭ�������� ������ ���
	//2.private : ���� Ŭ���������� ����� �㰡
	//3.protected : ��Ӱ����� Ŭ���������� ����� �㰡
	//4.default(�⺻��) : ���� ��Ű�� ���� Ŭ�������Ը� ������ ���
}



































