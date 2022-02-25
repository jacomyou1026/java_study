package ex2_method;

public class MethodTest {
	
	public void test() {
		System.out.println("------------------");
	}
	
	public void test2( int n ) {
		System.out.println("저의 나이는 " + n + "살 입니다");
	}
	
	public void exam( int n ) {
		n += 100;
		System.out.println("n : " + n);
	}
	
	public int exam2( int s ) {
		
		s += 50;
		System.out.println("s : " + s);
		
		//최종적으로 값을 반환하기 위한 return
		//return : 나를 호출했던 곳으로 딱 한개의 값을 가지고 되돌아가는 키워드
		return s;
		
	}
	
}












