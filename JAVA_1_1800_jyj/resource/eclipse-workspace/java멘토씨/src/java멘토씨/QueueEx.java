package java���侾;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<>();
		// 1. add(e):rear��ġ ����
		q.add("apple");
		q.add("banana");
		q.add("cherry_bomb");
		q.add("tomato");
		
		System.out.println(q);
		//2.element:front�� ������ ������ ��ȯ
		System.out.println(q.element());
		
		//2.1 remove: front��ġ�� ������ ����
		System.out.println("remove :"+q.remove());
		System.out.println("remove :"+q.remove());

		//3.offer(E):rear��ġ�� ������ ����
		q.offer("peach");
		System.out.println(q);
		
		//4.peek():front�� �ִ� ������ ���� ��ȯ
		System.out.println("peek: "+q.peek());
		
		
		//5.poll():front�� ��ġ�� ������ ��ȯ �� ��
		System.out.println("poll: "+q.poll());
		System.out.println(q);
		
		
	}

}
