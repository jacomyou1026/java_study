package java���侾;
import java.util.*;
public class switch_Traffic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�١١١ٽ�ȣ�� ���α׷��١١١١�");
		System.out.println("������:1 �����:2 �ʷϺ�:3");
		System.out.println("��ȣ:");
		int sign = sc.nextInt();
		switch(sign) {
		case 1:
			System.out.println("���߽ÿ�");
			break;
		case 2:
			System.out.println("break��������");
			break;
		case 3:
			System.out.println("����ϼ���");
			break;
			default : System.out.println("����ڰ� �߸� �Է��ϼ̽��ϴ�.");
		}
		 
	}

}
