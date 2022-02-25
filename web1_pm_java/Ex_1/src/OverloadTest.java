
public class OverloadTest {
	public void getResult() {
		//오버로딩 : 메서드의 '중복정의' 라고 하며, 하나의 클래스 내에서 같은 이름을 가진 메서드가 여러개 정의
		
		//1)
		System.out.println("인자가 없는 메서드");
	}
	public void getResult(int n) {
		System.out.println("인자를 정수를 받는 메서드");
	}
	
}
