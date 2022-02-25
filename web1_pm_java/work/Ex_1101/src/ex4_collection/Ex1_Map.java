package ex4_collection;

import java.util.HashMap;

public class Ex1_Map {
	public static void main(String[] args) {
		
		//Map : 키(key)와 값(value)을 하나의 데이터로 묶어서 저장한다
		//키를 통해서 값을 검색하는 구조이므로 많은양의 데이터를 검색하는데 있어서 매우 뛰어난 성능
		
		//맵 구조는 중복된 key값을 사용할 수 없다
		HashMap<Integer, Boolean> map1 = new HashMap<Integer, Boolean>();
		map1.put(1, true);
		map1.put(2, false);
		map1.put(3, true);
		map1.put(3, false);//key가 중복되면 나중에 추가된 key값으로 value가 갱신
		
		map1.remove(1);//key가 1인 데이터를 삭제
		
		System.out.println( map1.size() );
		System.out.println( map1 );
		
		boolean res = map1.get(3);
		System.out.println(res);
		
		System.out.println("----------------------");
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("key1", "나는 빨강");
		map2.put("key2", "나는 파랑");
		map2.put("key3", "나는 노랑");
		
		String ss = map2.get("key2");
		System.out.println(ss);
		
		System.out.println( map2.containsKey("key1") );
		System.out.println( map2.containsValue("노랑") );
		
	}//main
}













