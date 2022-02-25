package ex4_collection;

import java.util.HashMap;

public class Ex1_Map {
	public static void main(String[] args) {
		
		//Map : Ű(key)�� ��(value)�� �ϳ��� �����ͷ� ��� �����Ѵ�
		//Ű�� ���ؼ� ���� �˻��ϴ� �����̹Ƿ� �������� �����͸� �˻��ϴµ� �־ �ſ� �پ ����
		
		//�� ������ �ߺ��� key���� ����� �� ����
		HashMap<Integer, Boolean> map1 = new HashMap<Integer, Boolean>();
		map1.put(1, true);
		map1.put(2, false);
		map1.put(3, true);
		map1.put(3, false);//key�� �ߺ��Ǹ� ���߿� �߰��� key������ value�� ����
		
		map1.remove(1);//key�� 1�� �����͸� ����
		
		System.out.println( map1.size() );
		System.out.println( map1 );
		
		boolean res = map1.get(3);
		System.out.println(res);
		
		System.out.println("----------------------");
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("key1", "���� ����");
		map2.put("key2", "���� �Ķ�");
		map2.put("key3", "���� ���");
		
		String ss = map2.get("key2");
		System.out.println(ss);
		
		System.out.println( map2.containsKey("key1") );
		System.out.println( map2.containsValue("���") );
		
	}//main
}













