package Sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, tmp;
		int arr[] = { 2, 1, 4, 23, 5 };
		System.out.println("정렬 전");
		for (i = 0; i < arr.length; i++) {
			System.out.print(+arr[i] + " ");
		}
		System.out.println();
		for (i = arr.length - 1; i > 0; i--) {
			for (j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					for (int k = 0; k < arr.length; k++) {
						System.out.print(arr[k] + " ");
					}
					System.out.println();
				}
			}
		}
		
		System.out.println();
		System.out.println("정렬 후");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
