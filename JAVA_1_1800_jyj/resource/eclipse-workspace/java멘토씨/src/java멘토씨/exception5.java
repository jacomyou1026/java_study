package java���侾;

public class exception5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=-1;
		try {
			ticketing(age);
		}catch(AgeException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
	}

	public static void ticketing(int age) throws AgeException{
		if(age<0) {
			throw new AgeException("���� �Է��� �߸��Ǿ����ϴ�.");
		}
	}
}
class AgeException extends Exception{
	public AgeException() {}
	public AgeException(String message) {
		super(message);
	}
	
}