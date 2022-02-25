package ex5_collection;


public class work {
	public static void main(String[] args) {
		int[]arr = {3,2,4,23,12,34,5};
		int temp;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}
		for (int i = 0; i < arr.length-1; i++) {
				if(arr[i]>arr[i+1]) {
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1] = temp;
				}
			}
		
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
