
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int ar[]= {8,1,2,5,4,3,6,7,};
		 int idx,tmp;
		 System.out.println("-----------출력 전-----------");
		 for(int k=0;k<ar.length;k++) {
			 System.out.print(ar[k]+" ");
		 }
		 System.out.println();
		 for(int i=1;i<ar.length;i++) {
			 idx=i;
			 for(int j=i-1;j>=0;j--) {
				if(ar[j]>ar[idx]) { 
					tmp =ar[j];
					ar[j]=ar[idx];
					ar[idx]=tmp;
					for(int k=0;k<ar.length;k++) {
						 System.out.print(ar[k]+" ");
					 }
					System.out.println();
				}
				else {
					break;
				}
			 }
			
		 }
		 System.out.println();
		 System.out.println("-----------출력 후-----------");
		 for(int i=0;i<ar.length;i++) {
			 System.out.print(ar[i]+" ");
		 }
	}

}
