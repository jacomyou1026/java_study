package ex4_collection;

import java.util.HashMap;
import java.util.Scanner;

public class Ex2_Map {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("kim", 1111);
		map.put("park", 2222);
		map.put("lee", 3333);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("id : ");
		String id = sc.next();
		
		System.out.print("pwd : ");
		int pwd = sc.nextInt();
		
		if( !map.containsKey(id) ) {//map.containsKey(id) == false
			System.out.println("아이디가 존재하지 않습니다");
			
		}else {
			//아이디는 일치할 때
			if( map.get(id) == pwd ) {
				System.out.println("로그인 성공!!");
			}else {
				System.out.println("비밀번호 불일치");
			}
			
		}
		
	}//main
}







