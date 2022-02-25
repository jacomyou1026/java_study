package java멘토씨;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<>();
		// 1. add(e):rear위치 삽입
		q.add("apple");
		q.add("banana");
		q.add("cherry_bomb");
		q.add("tomato");
		
		System.out.println(q);
		//2.element:front에 위차한 데이터 반환
		System.out.println(q.element());
		
		//2.1 remove: front위치한 데이터 삭제
		System.out.println("remove :"+q.remove());
		System.out.println("remove :"+q.remove());

		//3.offer(E):rear위치에 데이터 삽입
		q.offer("peach");
		System.out.println(q);
		
		//4.peek():front에 있는 데이터 값만 반환
		System.out.println("peek: "+q.peek());
		
		
		//5.poll():front에 위치한 데이터 반환 후 삭
		System.out.println("poll: "+q.poll());
		System.out.println(q);
		
		
	}

}
