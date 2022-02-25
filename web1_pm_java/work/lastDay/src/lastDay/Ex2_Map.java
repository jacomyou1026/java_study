package lastDay;

import java.util.HashMap;
import java.util.Scanner;

public class Ex2_Map {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("kim", 1111);
		map.put("park", 2222);
		map.put("lee", 333);
		Scanner sc = new Scanner(System.in);
		System.out.print("id : ");
		String id = sc.next();
		System.out.print("pwd : ");
		int pwd = sc.nextInt();
		if(map.containsKey(id)){
			if(map.containsValue(pwd)) {
				System.out.println("로그인 성공!!");
			}else {
				System.out.println("비밀번호가 틀립니다.");
			}
				
		}else {
			System.out.println("아이디가 존재하지 않습니다.");
			System.out.println("회원가입 창으로 가십쇼!");
			map.put(id, pwd);
			System.out.println("id :"+id);
			System.out.println("pwd :"+pwd);
			System.out.println("회원가입되었습니다.");
		}
	}
}
