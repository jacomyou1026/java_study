package Sort;

public class BubbleEx {
	
	private static void print_array(int list[]) {
		for(int i =0; i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
	}
	private static  void bubble_sort(int arr[]) {
		int tmp;
		int i;
		int j;
		for( i = arr.length-1;i>0;i--) {
			for(j=0;j<i;j++) {
				System.out.printf("i :%d, j:%d, j+1:%d \n",i,j,j+1);
				if(arr[j]>arr[j+1]) {
				tmp =arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=tmp;
				}
			}
		}
		System.out.println("���� ��");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,6,3,8,1,2,4};
		System.out.println("���� ��");
		print_array(arr);
		bubble_sort(arr);
		print_array(arr);
	}

}
