package work;

import java.util.Scanner;

public class ActorMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		ActorInfo af = new ActorInfo();
		System.out.println(af.search(name));
	}
}
