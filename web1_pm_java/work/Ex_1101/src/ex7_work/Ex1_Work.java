package ex7_work;

public class Ex1_Work {
	public static void main(String[] args) {
		
		//아래의 배열의 값 중 가장 큰 값을 찾아 출력하시오
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














