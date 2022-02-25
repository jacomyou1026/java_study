package java멘토씨;

public class Excpetion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exception e =new Exception("고의 예외");
			throw e;
		}catch(Exception e) {
			System.out.println("예외 발생");
			System.out.println(e.getMessage());
		}
	}

}
