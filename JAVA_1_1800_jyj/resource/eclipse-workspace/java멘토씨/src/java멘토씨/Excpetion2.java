package java���侾;

public class Excpetion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exception e =new Exception("���� ����");
			throw e;
		}catch(Exception e) {
			System.out.println("���� �߻�");
			System.out.println(e.getMessage());
		}
	}

}
