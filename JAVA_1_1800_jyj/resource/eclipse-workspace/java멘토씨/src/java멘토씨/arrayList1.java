package java詮饜噢;

import java.util.ArrayList;
import java.util.LinkedList;

public class arrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		LinkedList ll = new LinkedList();
		long start = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			al.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList 濛機衛除: "+(end-start));
		
		start = System.currentTimeMillis();
		for(int i=0;i<10000;i++) {
			ll.add(i);
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedList 濛機衛除"+(end-start));
		
	}

}
