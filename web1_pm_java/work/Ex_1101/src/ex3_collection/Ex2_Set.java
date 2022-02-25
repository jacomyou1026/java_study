package ex3_collection;

import java.util.HashSet;
import java.util.TreeSet;

public class Ex2_Set {
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("È«±æµ¿");
		hs.add("Á¤¿ëÈÆ");
		hs.add("¼ÕÈï¹Î");
		hs.add("¼ÕÈï¹Î");
		hs.add("apple");
		hs.add("apple");
		
		System.out.println( hs );
		
		System.out.println("--------------------");
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("È«±æµ¿");
		ts.add("Ç×±æµ¿");
		ts.add("Á¤¿ëÈÆ");
		ts.add("Àå¹Ì");
		ts.add("bear");
		ts.add("apple");
		
		System.out.println( ts );
		
	}//main
}








