package ex5_operator;

public class Ex1_Work {
	public static void main(String[] args) {
		/*
		 �������� �ִ�.
		 ��, ���, �������� Ű��� �ִµ� �Ϸ翡 ����Ǵ� ������ ���� ����
		 //5��,7��,5����.
		1)���������� �Ϸ翡 ����Ǵ� ������ �Ѱ����� ���
		2)�ð��� ��ü ������ ��� ���� ������ ���
		
		  ��,������ ������ ������ ������ ����
		  �Ϸ���귮 ���� ����
		  �ð��� ��� ���� ���� ������ ���� float
		��� --
		�Ϸ� ���귮 :17
		�ð��� ��� : 0.708
		 */
		int apple =5;
		int pear=7;
		int orange =5;
		
		int total = apple+pear+orange;
		float avg = total/24f;
		System.out.println(total);
		System.out.println(avg);
	}
}
