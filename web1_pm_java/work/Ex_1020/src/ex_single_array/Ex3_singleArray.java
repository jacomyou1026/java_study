package ex_single_array;

public class Ex3_singleArray {
	public static void main(String[] args) {
		//배열 arr에 담겨있는 모든 값의 합을 출력
		int[] arr = {10,23,7,30,3};
		int result =0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		System.out.println(result);
	}
}	
