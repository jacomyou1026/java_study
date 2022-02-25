package java∏‡≈‰ææ;

import java.util.Stack;

public class stackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s = new Stack<>();
		s.push("apple");
		s.push("peach");
		s.push("cherry");
		System.out.println(s);
		
		System.out.println("pop: "+s.pop());
		System.out.println(s);
		
		System.out.println("peek: "+s.peek());
		
		System.out.println(s.search("apple"));
		System.out.println(s.search("peach"));
		
		
	}

}
