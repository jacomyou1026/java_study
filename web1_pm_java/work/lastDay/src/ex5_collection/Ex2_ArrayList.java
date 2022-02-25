package ex5_collection;

import java.util.ArrayList;

public class Ex2_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<>();
		ar.add("장비");
		ar.add("유비");
		ar.add("전위");
		ar.add("관우");
		ar.add("조조");
		
		System.out.println(ar);
		ar.set(0, "유비");
		ar.set(1, "관우");
		ar.set(2, "장비");
		ar.set(3, "조조");
		ar.set(4, "황충");
		System.out.println(ar);
	}
}