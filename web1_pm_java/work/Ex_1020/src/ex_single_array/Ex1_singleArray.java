package ex_single_array;

import java.util.Iterator;

public class Ex1_singleArray {
	public static void main(String[] args) {
		//�迭 : '���� �ڷ��� ���� ��Ƶ� �ϳ��� ����'
		//ȿ������ �ڷ������ ���� �ݵ�� �ʿ�.
		
		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;
		
		System.out.println(su1);
		System.out.println(su2);
		System.out.println(su3);
		System.out.println(su4);
		
		System.out.println("============");
		
		//�迭 
		//1) �迭 ����
		int[] arr;
		
		//2) �迭 ����
		arr = new int[4];
		
		//3) �迭 �ʱ�ȭ
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		arr[3]=400;
		//arr[4] ==> �迭�� �������� �ʴ� index�� ���� �߰��� �� ����.
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("=============");
		int [] myarr = new int[4];
		for (int i = 0; i < myarr.length; i++) {
			myarr[i] =(i+1)*100;
			System.out.println(myarr[i]);
		}
		
	}
}
