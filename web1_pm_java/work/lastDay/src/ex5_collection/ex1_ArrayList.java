package ex5_collection;

import java.util.ArrayList;

public class ex1_ArrayList {
	public static void main(String[] args) {
		//Arraylist : �迭ó�� index�� ������ ������ ������ �����ν�
		//�� ������ ������ �����Ƿ� ���� �߰��ϰų� �����ϴµ� �ſ� ����
		
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
