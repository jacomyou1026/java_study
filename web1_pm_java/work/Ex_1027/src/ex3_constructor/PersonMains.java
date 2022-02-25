package ex3_constructor;

import java.util.ArrayList;
import java.util.Scanner;



public class PersonMains {
	public static void main(String[] args) {
		ArrayList<Person> arr = new ArrayList<Person>();
		Scanner sc = new Scanner(System.in);
		
		outer : while(true) {
			Person p = new Person();
			System.out.print("id");
			String id= sc.next();
			p.setId(id);
			System.out.print("pwd");
			String pwd= sc.next();
			p.setPwd(pwd);
			
			for(int i =0;i<arr.size();i++) {
					if(arr.get(i).getId().equals(id)) {
						System.out.println("id가 중복되었습니다.");
						continue outer;
					}
					
			}
			
			arr.add(p);
			for(int i =0;i<arr.size();i++) {
			System.out.println(arr.get(i).getId()+"/"+arr.get(i).getPwd());
			}
			System.out.println("------------------------------");
		}
	}
	
}
