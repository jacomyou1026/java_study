package java멘토씨;

public class finally_1 {
	public static void main(String[] args) {
		int a=0;
		int b=2;
		try {
			int c=b/a;
			System.out.println("외부로 접속");
		}catch(ArithmeticException e) {
		System.out.println("오류발생");	
		}
		finally {
			System.out.println("무조건 연결해제");
		}
	}
}
