package ex3_collection;

import java.util.HashSet;
import java.util.TreeSet;

public class Ex2_Set {
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("ȫ�浿");
		hs.add("������");
		hs.add("�����");
		hs.add("�����");
		hs.add("apple");
		hs.add("apple");
		
		System.out.println( hs );
		
		System.out.println("--------------------");
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("ȫ�浿");
		ts.add("�ױ浿");
		ts.add("������");
		ts.add("���");
		ts.add("bear");
		ts.add("apple");
		
		System.out.println( ts );
		
	}//main
}








