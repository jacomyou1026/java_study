package lastDay;

import java.util.HashMap;

public class ex1_map {
	public static void main(String[] args) {
		
		//Map : Ű(key)�� ��(value)�� �ϳ��� �����ͷ� ��� �����Ѵ�.
		//Ű�� ���ؼ� ���� �˻��ϴ� �����̹Ƿ� �������� �����͸� �˻��ϴµ� �־ �ſ� �پ ����
		
		//map ������ �ߺ��� key���� ����� �� ����.
		
		HashMap<Integer,Boolean> map1 = new HashMap<>();
		map1.put(1, true);
		map1.put(2, false);
		map1.put(3, true);
		map1.put(4, false);
		map1.put(3,false); //key�� �ߺ��Ǹ� ���߿� �߰��� key������ value�� ����
		System.out.println(map1);
		System.out.println(map1.get(2));
		System.out.println(map1.size());
		boolean res = map1.get(1);
		System.out.println(res);
		
		map1.remove(1);
		
		System.out.println("--------------");
		HashMap<String,String> hm = new HashMap<String, String>();
		hm.put("key1", "���� ����");
		hm.put("key2", "���� �Ķ� ");
		hm.put("key3", "���� ���");
		
		String ss = hm.get("key2");
		System.out.println(ss);
		
		  boolean a = hm.containsKey("key1");
		  System.out.println(a);
		  
		  boolean b= hm.containsValue("���");
		 System.out.println(b);
	}
}
