package java���侾;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class treeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs= new HashSet();
		hs.add("demon");
		hs.add("banana");
		hs.add("tomato");
		hs.add("cargo");
		
		TreeSet ts = new TreeSet();
		ts.add("demon");
		ts.add("banana");
		ts.add("tomato");
		ts.add("cargo");
		
		Iterator it =hs.iterator();
		System.out.println("<HashSet ���>");
		while(it.hasNext()) {
			System.out.print(" "+it.next());
		}
		System.out.println();		
		Iterator it2 = ts.iterator();
		System.out.println("<TreeSet ���>");
		while(it2.hasNext()) {
			System.out.print(" "+it2.next());
		}
		System.out.println();
		System.out.println("���� TreeSet�� ũ��:"+ts.size());)
		
	}

}
