package ex6_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Person> arr = new ArrayList<Person>();
				
		outer : while( true ) {
			
			Person p = new Person();
			
			System.out.print("id : ");
			String id = sc.next();
			
			//id 중복체크
			for( int i = 0; i < arr.size(); i++ ) {
				if( arr.get(i).getId().equals(id) ) {
					System.out.println("아이디가 중복됨. 다른 아이디를 생성하세요");
					continue outer;
				}
			}
			
			p.setId(id);
			
			System.out.print("pwd : ");
			int pwd = sc.nextInt();
			p.setPwd(pwd);
			
			arr.add(p);
			
			for( int i = 0; i < arr.size(); i++ ) {
				
				System.out.printf("%s / %d\n", 
						arr.get(i).getId(), arr.get(i).getPwd());
				
			}//for			
			
			System.out.println("--------------------");
			
		}//while
		
	}//main
}














