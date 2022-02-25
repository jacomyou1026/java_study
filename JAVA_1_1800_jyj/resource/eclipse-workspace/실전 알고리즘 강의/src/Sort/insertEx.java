package Sort;

public class insertEx {

	public static void main(String[] args) {
		int i, j, tmp, index;
		int arr[] = { 2, 1, 4, 5, 3, 6, 8, 7 };
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + ", ");
		}
		System.out.println();
		for (i = 1; i < arr.length; i++) {
			index = i;
			for (j = i - 1; j >= 0; j--) {
				if (arr[index] < arr[j]) {
					tmp = arr[j];
					arr[j]=arr[index];
					arr[index]=tmp;
				}
			}
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + ", ");
		}
	}
}
