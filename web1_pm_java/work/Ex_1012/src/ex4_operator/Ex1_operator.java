package ex4_operator;

public class Ex1_operator {
	public static void main(String[] args) {
		/*
		 	������
		 	1.�ְ����� : . , ()
		 	2.����������: ++, --
		 	3.��������� ;+,-,*,/,%
		 	4.����Ʈ������ :>>,<<
		 	5.�񱳿����� : >,<,>=,<=,==,!=
		 	6.��Ʈ������ :& , |, ^,~
		 	7.�������� &&,||, !
		 	8.���׿����� : ? , :
		 	9.���Կ����� : = ,*=,/=,%=,+=,-=
		 	
		 	 
		 */
		//��������� : 4Ģ����� ������ �����ڸ� ������ �ֵ�.
	 	int n1 = 20;
	 	int n2 = 7;
	 	int n3 = n1+n2;
	 	float a1 = 10;
	 	float a2 =a1/4;
	 	System.out.println(a2);
	 	
	 	
	 	System.out.println("---------------------");
	 	
	 	//���Կ�����
	 	//Ư�� ���� ������ �����Ͽ� ����ų �� ����ϴ� ������
	 	int i1 = 10;
	 	int i2 = i1+=10; // i1 = i1+10
	 	System.out.println(i2);
	 	
	 	i1 -=5;
	 	System.out.println(i1);
	 	i1/=3; // i1 = i1/3
	 	System.out.println(i1);
	 	i1 %=3;
	 	System.out.println(i1);
	 	
	}
}
