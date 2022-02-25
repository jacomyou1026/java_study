package java¸àÅä¾¾;

import java.util.Arrays;

public class Array_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stu = {23,35,34,31,66,53};
		int sum=0;
		for(int i=0;i<stu.length;i++) {
			sum+=stu[i];
			
		}
		System.out.println("½ÃÇè Á¡¼öÀÇ Æò±Õ:"+sum/(float)stu.length);
		
	}

}
