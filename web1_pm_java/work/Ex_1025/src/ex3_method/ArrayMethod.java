package ex3_method;

public class ArrayMethod {
	
	public void printArr( int[] arr ) {
		//파라미터 값은 기본자료형으로 넘겨받을때는 복사본이 넘어오지만, 
		//객체가 넘어오면 주소값을 공유하게 된다
		arr[0] = 1;
		
		for( int i = 0; i < arr.length; i++ ) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		//return;
		
	}
	
}
