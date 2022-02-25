package ex5_work;

import java.util.Random;

public class Graph {
	public static void main(String[] args) {
		int[] arr = new int[100];
		int[] count=new int[10];
		String[] c = new String[10];
		for (int i = 0; i < arr.length; i++) {
			int r = new Random().nextInt(10);
			count[r-0]++;
			
		}
		
		
		for (int i = 0; i < count.length; i++) {
			System.out.print(i+"ÀÇ °¹¼ö : ");
			for (int j = 0; j < count[i]; j++) {
				
				System.out.print("#");
			}
			System.out.println(" "+count[i]);
		}
	}
}
