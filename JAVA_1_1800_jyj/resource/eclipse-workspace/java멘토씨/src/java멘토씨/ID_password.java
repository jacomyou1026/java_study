package java���侾;
import java.util.*;

public class ID_password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String id,password;
		System.out.println("���̵� �Է��Ͻÿ�: ");
		id=sc.nextLine();
		if(id.equals("java")) {
			System.out.println("��ġ");
			System.out.println("��й�ȣ �Է��ϼ���:");
			password = sc.nextLine();
			if(password.equals("232")) {
				System.out.println("��й�ȣ ��ġ!");
				System.out.println("�α��� ����");
			}
			else {
				System.out.println("�н����� ����ġ");
			}
		}else {
			System.out.println("���Լ���??");
			System.out.println("ID����ġ");
			
		}
		
	}

}
