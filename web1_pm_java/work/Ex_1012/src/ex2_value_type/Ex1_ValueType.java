package ex2_value_type;

public class Ex1_ValueType {
	public static void main(String[] args) {
		
		//�⺻�ڷ��� : ���� �����ϱ� ���� �׸��� ���� ����
		//���� : boolean
		//������ : char
		//������ : byte ..... 1byte( -128 ~ 127 )
		//		  short .... 2byte( -32768 ~ 32767 )
		//		  int ...... 4byte( -21�� ~ 21�� )
		//		  long ..... 8byte( -900�� ~ 900�� ) 
		//�Ǽ��� : float ..... 4.x byte
		//		  double .... 8.x byte
		
		//���� : ���� �����ϱ� ���� ����
		//���� ���� ��Ģ
		//1) ������ ���ڷ� ������ �� ����
		//2) _�� �����ϰ� Ư�����ڸ� ����� �� ����
		//3) �ѱ��� ������� ����!!
		//4) �������� �ҹ��ڷ� ����
		
		//�ڷ��� ������;(����)
		//������ = ��;(����)
		//�ڷ��� ������ = ��;(����� ������ ���ÿ�. �ʱ�ȭ)
		//--------------------------------------
		
		//����
		//������ true, false��, ����̴ٿ� �����̴��� �ΰ��� �� ���� ������ �� �ִ�.
		boolean b;
		//b = 100; <-- �ڷ��� Ÿ�԰� �����ʴ� ���� ���ԵǸ� ����
		b = false;
		System.out.println("b:" + b);
		
		b = true;
		System.out.println("b:" + b);
		
		System.out.println("--------------------------");
		
		//������ : Ȭ����ǥ �ȿ� �ѱ��ڸ� ���� ������ �ڷ���
		char c = 'A';
		System.out.println("c:" + c);
		
		char c2 = 66 + 1;
		c2 = 'D' + 2;
		System.out.println( "c2:" + c2 );
		
		System.out.println("---------------------------");
		
		//������
		byte b1 = 127;
		short s = 32767;
		
		int n = 2100000000;
		long lo = 2200000000L;
		
		System.out.println( n );
		System.out.println( lo );
		
		System.out.println("-------------------");
		
		//�Ǽ��� : �Ҽ����� �����ϰ� �ִ� ���� �����ϰ��� �� �� ����ϴ� �ڷ���
		float f1 = 3.14f;
		double d1 = 3.14;
		
		f1 = 100;
		d1 = 100;
		
		System.out.println( f1 );
		System.out.println( d1 );
	}//main
}


























