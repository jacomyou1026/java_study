package work;

import java.util.ArrayList;

public class Person {
	static int count = 0;
	static ArrayList<PersonDAO> al = new ArrayList<>();
	
	void insert(PersonDAO person) {
		count++;
	}
	
	boolean delete(String name) {
		boolean ischeck = false;
		System.out.println("--���� ����--");
		for (int i = 0; i < al.size(); i++) {
			if(al.get(i).getNames().equals(name)) {
				al.remove(al.get(i));
				count--;
				ischeck = true;
			}
		}
		return ischeck;
	}
	void info() {
		System.out.println("--��ü ����--");
		System.out.println("����ο�"+count+"��");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i).getNames()+"/"+
		al.get(i).getAge()+"/"+al.get(i).getTel()
		);
			
		}
	}

	
	
}
