package ex5_collection;

import java.util.ArrayList;

public class Ex2_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<>();
		ar.add("���");
		ar.add("����");
		ar.add("����");
		ar.add("����");
		ar.add("����");
		
		System.out.println(ar);
		ar.set(0, "����");
		ar.set(1, "����");
		ar.set(2, "���");
		ar.set(3, "����");
		ar.set(4, "Ȳ��");
		System.out.println(ar);
	}
}