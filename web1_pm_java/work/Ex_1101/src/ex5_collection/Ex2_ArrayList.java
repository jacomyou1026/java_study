package ex5_collection;

import java.util.ArrayList;

public class Ex2_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("���");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		
		list.remove(0);
		list.remove(1);
		list.add(2, "���");
		list.add("Ȳ��");
		
		System.out.println(list);
		
	}//main
}











