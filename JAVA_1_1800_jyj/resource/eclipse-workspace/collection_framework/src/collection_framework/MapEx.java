package collection_framework;
import java.util.HashMap;
import java.util.Iterator;
import java.util.*;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> a =new HashMap<String,Integer>();
		a.put("one", 1);
		a.put("one", 1);
		a.put("two", 2);
		a.put("three", 3);
		a.put("four", 4);
		iteratorUsingForEach(a);

	}
	static void iteratorUsingForEach(HashMap map) {
		Set<Map.Entry<String,Integer>> entries = map.entrySet();
		Ror(Map.Entry<String,Integer> entry:entries ) {
			System.out.print(entry.getKey()+":"+entry.getValue()+" ");
		}
	}
	static void iteratorUsingIterator(HashMap map) {
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		Iterator<Map.Entry<String, Integer>> i = entries.iterator();
		while(i.hasNext()) {
			Map.Entry<String, Integer> entry = i.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());

		}


	}

}
`