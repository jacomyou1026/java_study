package ex3_method;

public class ArrayMethod {
	
	public void printArr( int[] arr ) {
		//�Ķ���� ���� �⺻�ڷ������� �Ѱܹ������� ���纻�� �Ѿ������, 
		//��ü�� �Ѿ���� �ּҰ��� �����ϰ� �ȴ�
		arr[0] = 1;
		
		for( int i = 0; i < arr.length; i++ ) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		//return;
		
	}
	
}
