package ex1_string_method;

public class Ex1_StringMethod {
	public static void main(String[] args) {
		
		//�޼��� : � �۾��� �����ϱ� ���� ��ɹ����� ����
		//�ݺ������� ���Ǵ� �ڵ带 ���̱� ���ؼ� ����Ѵ�
		String str = "Hong Gil Dong";
		int len = str.length();
		System.out.println( "���ڿ� str�� ���� : " + len );
		
		int res = str.indexOf('o');
		System.out.println( "�� �� o�� ��ġ : " + res );
		
		res = str.indexOf("Gil");
		System.out.println("���� Gil�� ���� ��ġ : " + res);
		
		res = str.lastIndexOf('o');
		System.out.println("���� ���� o�� ��ġ : " + res);
		
		char ch = str.charAt(6);
		System.out.println("6��° ��ġ�� ���� : " + ch);
		
		String str2 = str.substring(2, 8);
		System.out.println("�߶� ���ڿ� : " + str2);
		
		String a = "   apple           ";
		String a2 = a.trim();//���� �Ǿհ� �ڿ� �ִ� �ǹ̾��� ������ ����
		String b = "apple";
		if( a2.equals(b) ) {//a�� b�� ���� ������ ��
			System.out.println("���� �����ϴ�");
		}
		
		String i1 = "apple";
		String i2 = "Apple";
		//��ҹ��ڸ� ������ �ʰ� ���� �����ִ� �޼���
		if( i1.equalsIgnoreCase(i2) ) {
			System.out.println("�����ϴ�");
		}
		
		String number = "100";
		int num = Integer.parseInt( number );
		System.out.println(num + 10);
		
		//WrapperŬ���� : �⺻�ڷ����� �����ϰ� �ִ� �θ𰳳��� Ŭ����
		//boolean  ->  Boolean
		//char -> Character
		//int -> Integer
		//byte -> Byte
		//short -> Short
		//long -> Long
		//float -> Float
		//double -> Double
	}//main
}























































