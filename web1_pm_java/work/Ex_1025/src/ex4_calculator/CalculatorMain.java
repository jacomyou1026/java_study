package ex4_calculator;

import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] args) {

		//Ű���忡�� ������ �� �� �Է¹ް�
		//�Է¹��� ���� ���� ��Ģ������ ����� ����Ͻÿ�

		//��1 : 5
		//��2 : 2
		//�����ȣ : +
		//��� : 7

		//��1 : 3
		//��2 : 7
		//�����ȣ : *
		//��� : 21
		Scanner sc = new Scanner(System.in);
		System.out.print("��1 : ");
		int su1 = sc.nextInt();
		
		System.out.print("��2 : ");
		int su2 = sc.nextInt();
		
		System.out.print("�����ȣ : ");
		String op = sc.next();
		
		Calculator cal = new Calculator();
		cal.getResult(su1, su2, op);
		
	}//main
}








