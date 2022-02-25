package ex3_method;

public class GuguMain {
	public static void main(String[] args) {
		
		Gugudan gg = new Gugudan();
		gg.showGugu(5);
		
		System.out.println("--------------------");
		
		int[] arr = {2, 4, 6, 8};
		ArrayMethod am = new ArrayMethod();
		am.printArr( arr );
		
		for( int i = 0; i < arr.length; i++ ) {
			System.out.print(arr[i] + " ");
		}
		
	}//main
}










