package ex1103;

import java.util.ArrayList;

public class UserMain {
	public static void main(String[] args) {
		ArrayList<User> arr =new ArrayList<User>();
		User u1 = new User();
		u1.setName("ȫ�浿");
		u1.setAge(21);
		u1.setBt('A');
		
		User u2 = new User();
		u2.setName("�ڱ浿");
		u2.setAge(23);
		u2.setBt('B');
		
		arr.add(u1);
		arr.add(u2);
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i).getName()+"/"+
			arr.get(i).getAge()+"/"+arr.get(i).getBt());
			
			System.out.printf("%s/%d/%c\n",arr.get(i).getName(),arr.get(i).getAge(),arr.get(i).getBt());
			
		}
		
	}
}
