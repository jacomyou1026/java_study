package java멘토씨;

public class exception_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int []a= {2,0,0};
			int b=4;
			int c=b/a[2];
			System.out.println(c);
		}catch(ArithmeticException e){
			System.out.println("산술오류 발생");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 길이 오류 발생");
		}
		System.out.println("예외 처리 공부 중");
	}
}
