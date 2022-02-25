
public class Bread {
	void makeBread() {
		System.out.println("빵을 만들었습니다.");
		System.out.println("-------------------");
	}
	void makeBread(int s) {
		for (int i = 0; i < s; i++) {
			System.out.println("빵을 만들었습니다.");
		}
		System.out.println("요청하신 "+s+"개의 빵을 만들었습니다.");
		System.out.println("----------------------------");
		
	}
	void makeBread(String n, int s) {
		for (int i = 0; i < s; i++) {
			System.out.println(n+"을 만들었습니다.");
		}

		System.out.println("요청하신 "+n+"개의 "+n+"빵을 만들었습니다.");
	}
}
