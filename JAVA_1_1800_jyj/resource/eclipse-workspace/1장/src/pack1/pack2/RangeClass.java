package pack1.pack2;

public class RangeClass {
	int[] makeRange(int lower, int upper) {
		int arr[] = new int[(upper-lower)+1];
		for(int i=0;i<arr.length;i++) {
			arr[i]=lower++;
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int theArray[];
		RangeClass arange = new RangeClass();
		int low=1,high=10;
		theArray = arange.makeRange(low, high);
		System.out.println("The array:[");
		for(int i=0;i<theArray.length;i++) {
			System.out.print(theArray[i]+" ");
		}
		System.out.println("]");
	}

}
