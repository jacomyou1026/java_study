package java멘토씨;
import java.util.*;

public class ID_password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String id,password;
		System.out.println("아이디를 입력하시오: ");
		id=sc.nextLine();
		if(id.equals("java")) {
			System.out.println("일치");
			System.out.println("비밀번호 입력하세요:");
			password = sc.nextLine();
			if(password.equals("232")) {
				System.out.println("비밀번호 일치!");
				System.out.println("로그인 성공");
			}
			else {
				System.out.println("패스워드 불일치");
			}
		}else {
			System.out.println("누규세요??");
			System.out.println("ID불일치");
			
		}
		
	}

}
