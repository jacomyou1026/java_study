package ex7_work;

public class Ex1_Work {
	public static void main(String[] args) {
		
		//�Ʒ��� �迭�� �� �� ���� ū ���� ã�� ����Ͻÿ�
		int[] arr = {22, 53, 71, 35, 62};
		int max = arr[0];
		
		for( int i = 1; i < arr.length; i++ ) {
			
			if( arr[i] > max ) {
				max = arr[i];
			}
			
		}//for
		
		System.out.println(max);
		
	}//main
}














