package ex5_collection;

import java.util.ArrayList;

public class Ex2_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("장비");
		list.add("유비");
		list.add("전위");
		list.add("관우");
		list.add("조조");
		
		list.remove(0);
		list.remove(1);
		list.add(2, "장비");
		list.add("황충");
		
		System.out.println(list);
		
	}//main
}











