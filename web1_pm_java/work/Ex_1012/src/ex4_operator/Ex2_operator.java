package ex4_operator;

public class Ex2_operator {
	public static void main(String[] args) {
		//�񱳿�����
		//������ ���� ���ϴ� ���� ������ �Ǵ��ϴ� ������
		int n1 = 10;
		int n2 = 20;
		boolean res = n1<n2;
		System.out.println("<  : "+res);
		res = n1>=n2;
		System.out.println(">= : "+res);
		res = n1==n2;
		System.out.println("== : "+res);
		res = n1!=n2;
		System.out.println("!= : "+res);
		// < : �۴� : lt
		// > : ũ�� : gt
		
		//���� ������
		//1�� ������Ű�ų� 1�� ���ҽ�Ű�� ������
		//���������� ���� ������ ������!
		int a =10;
		System.out.println("a : "+ ++a);
		
		int b =10;
		System.out.println("b : "+b++);
		
	}
}
