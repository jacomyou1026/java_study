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
			System.out.println("���̵� �������� �ʽ��ϴ�");
			
		}else {
			//���̵�� ��ġ�� ��
			if( map.get(id) == pwd ) {
				System.out.println("�α��� ����!!");
			}else {
				System.out.println("��й�ȣ ����ġ");
			}
			
		}
		
	}//main
}







