package ex2_constructor;

public class Note {
	
	private int page;
	private String brand;
	private int price;
	
	//Note n1 = new Note();
	public Note() {
		//������ : ��ü�� ������ �� �޸� �Ҵ��� ���� ȣ��Ǵ� �޼��尳���� ����
		//�����ڴ� ��ü�� �� �ѹ��� ȣ���� �� �ִ�.
		//1)�����ڴ� ��ȯ���� ����
		//2)Ŭ���� �̸��� ��ҹ��� ���� ������ �����ؾ� �Ѵ� 
		page = 50;
		brand = "�ٸ���";
		price = 1000;
		
		System.out.println("���� ������");
	}
	
	//������ �����ε�
	public Note( int page, int price ) {
		brand = "�ٸ���";
		this.page = page;
		this.price = price;
	}
	
	public void printNote() {
		System.out.println("ȸ�� : " + brand);
		System.out.println("������ : " + page);
		System.out.println("���� : " + price);
		System.out.println("----------------------");
	}
	
}














































