package java���侾;

public class exception_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			methodA();
		} catch (ArException e) {
			System.out.println("���ο��� ó��");
			System.out.println(e.getMessage());
		}
	}

	public static void methodA() throws ArException {
		methodB();
	}

	public static void methodB() throws ArException {
		methodC();
	}

	public static void methodC() throws ArException {
		ArException e = new ArException("����");
		throw e;
	}
}
class ArException extends Exception{
	public ArException() {
		
	}
	public ArException(String mess) {
		super(mess);
	}
}
