package java멘토씨;

public class Exception_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("외부 try....");
			try {
				System.out.println("내부 try....");
				Exception e = new Exception("하이루");
				throw e;
			}
			catch(Exception e) {
				System.out.println("내부 try-catch exception:"+e);
				System.out.println("예외던지기 한 번더:");
				throw e;
			}
			finally {
				System.out.println("finally 구문 출력");
			}
		}catch(Exception e) {
			System.out.println("외부 try-cathch exception:"+e);
		}
		System.out.println("종료");
	}

}
