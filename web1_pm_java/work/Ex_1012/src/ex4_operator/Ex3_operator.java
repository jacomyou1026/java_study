package ex4_operator;

public class Ex3_operator {
	public static void main(String[] args) {
		//���� ������
		//�ϳ��� ������ �����ϰ� �� ������ ����� ���� ���� �ٸ�
		//���� ���(����)�� �� �ֵ��� �� �ִ� ������
		int a =10;
		int b =15;
		boolean rse = ++a >= b ? true:false;
		for (int i = 0; i < 10; i++) {
			String res = i%2==0?"¦���Դϴ�." :"Ȧ���Դϴ�.";
			System.out.println(i+" = "+res);
		}
		
		System.out.println("-----------");
		//�� ������
		//�񱳿����ڰ� �� �� �̻� ���� �� ���̸� �������ִ� ������
		//&& ������ : ���� ������ �����̸� ���� ���� ����x
		
		int age =30;
		int limit=35;
		rse = limit-age >=5 &&age >30;
		System.out.println(rse);
		
		rse = limit -age >=5&&(age+=2)>limit;
		System.out.println(rse);
		System.out.println(age);
		rse = limit -age <5&&(age+=2)>limit;
		System.out.println(rse);
		
		//|| (or)������ : ���� ������ ���̸� ���� ������ ����x
		//
		int n1 =10;
		int n2 = 20;
		rse = (n1+=10)>20||n2-10==11;
		System.out.println(rse);
		
		//!(not)������ : �����տ� �ٿ��� ���� ������ �ٲٴ� ������
		System.out.println("------------------");
		boolean test = false;
		System.out.println(!test);
		
		test =!test;
		System.out.println(test);
		System.out.println("---------------");
		a =10;
		b=12;
		char test1= ++a>=b||2+(b-5)<=b&&13-b>=0&&(a+=b)-(b%a)>10?'0':'X';
		System.out.println(test1);
		
		
				
				
		
	}
}
