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
				System.out.println("�α��� ����!!");
			}else {
				System.out.println("��й�ȣ�� Ʋ���ϴ�.");
			}
				
		}else {
			System.out.println("���̵� �������� �ʽ��ϴ�.");
			System.out.println("ȸ������ â���� ���ʼ�!");
			map.put(id, pwd);
			System.out.println("id :"+id);
			System.out.println("pwd :"+pwd);
			System.out.println("ȸ�����ԵǾ����ϴ�.");
		}
	}
}
