
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int min,tmp;
		  int ar[]= {8,1,2,5,4,3,6,7,};
		  System.out.print("정렬 전: ");
		  for(int i=0;i<ar.length;i++) {
			  System.out.print(ar[i]+" ");
		  }

		  for(int i=0;i<ar.length-1;i++) {
			  min =i;
			  for(int j=i+1;j<ar.length;j++) {
				  if(ar[min]>ar[j]) {
					  tmp=ar[min];
					  ar[min]=ar[j];
					  ar[j]=tmp;
					  System.out.println();
					  System.out.println("swap 후!");
					  for(int k=0;k<ar.length;k++) {
						  System.out.print(ar[k]+" ");
					  }
					  System.out.println();
				  }
			  }
		  }
		  System.out.println();
		  System.out.print("정렬 후: ");
		  for(int i=0;i<ar.length;i++) {
			  System.out.print(ar[i]+" ");
		  }
	}

}
