package java멘토씨;

import java.util.*;

public class LinkedList_Arrat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		LinkedList ll = new LinkedList();
				
				
				
		long start = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			a1.add(0, String.valueOf(i));
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList 작업시ㅣ간: " + (end - start));

		start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			ll.add(0,String.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedList의 작업시간: "+(end-start));

	}

}
