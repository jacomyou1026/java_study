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
		System.out.println("--정보 삭제--");
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
		System.out.println("--전체 정보--");
		System.out.println("등록인원"+count+"명");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i).getNames()+"/"+
		al.get(i).getAge()+"/"+al.get(i).getTel()
		);
			
		}
	}

	
	
}
