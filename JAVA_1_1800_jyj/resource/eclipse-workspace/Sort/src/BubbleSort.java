
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 6, 7, 4, 9, 1 };
		int tmp;
		System.out.println("-----���� ��------");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		for (int i = ar.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (ar[j] > ar[j + 1]) {
					tmp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = tmp;
					for (int k = 0; k < ar.length; k++) {
						System.out.print(ar[k] + " ");
					}
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("-----���� ��------");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}

}
