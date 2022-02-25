package 복습;

import java.util.Stack;

public class QueueEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s = new Stack<String>();
		s.push("apple");
		s.push("banana");
		s.push("cherry");
		System.out.println(s);
		
		System.out.println("peek: "+s.peek());
		System.out.println("pop: "+s.pop());
		System.out.println(s);
		System.out.println("search(apple)"+s.search("apple"));
		
			
		
	}

}
