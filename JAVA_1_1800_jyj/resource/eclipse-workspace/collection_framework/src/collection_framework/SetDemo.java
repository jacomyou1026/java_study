package collection_framework;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		
		HashSet<Integer> B= new HashSet<Integer>();
		B.add(4);
		B.add(2);
		B.add(3);
		
		HashSet<Integer> C= new HashSet<Integer>();
		C.add(1);
		C.add(2);
		
		//System.out.println(A.containsAll(B));
		//System.out.println(A.containsAll(C));
		
		//A.addAll(B);
		A.retainAll(B);
		A.remove(B);
		Iterator hi = (Iterator)A.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
		
	}

}
