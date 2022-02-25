package ex5_collection;

import java.util.ArrayList;

public class ex1_ArrayList {
	public static void main(String[] args) {
		//Arraylist : 배열처럼 index를 가지고 접근이 가능한 구조로써
		//방 갯수에 제한이 없으므로 값을 추가하거나 삭제하는데 매우 용이
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		int len = list.size();
		System.out.println(len);
		System.out.println(list.get(1));
		
		System.out.println("----------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		list.add(1,5);
		System.out.println(list);
		list.set(1, 23);
		System.out.println(list);
		System.out.println(list.get(1));
		list.remove(1);
		System.out.println(list);
		System.out.println(list.get(len-1));
		
	}
}
