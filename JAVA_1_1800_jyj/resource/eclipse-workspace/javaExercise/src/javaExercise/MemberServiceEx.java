package javaExercise;
class MemberServic{
	String id; String pd;
	boolean login(String id, String pd) {
		id= "hong";
		pd="12345";
		return true;
	}
	void logout(String id) {
		if(id=="hong") {
			System.out.println("�α׾ƿ��Ǿ����ϴ�.");
		}
		
	}
}

public class MemberServiceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberServic member = new MemberServic();
		boolean result=member.login("hong", "12345");
		if(result) {
			System.out.println("�α����� �Ǿ����ϴ�.");
			member.logout("hong");
		}else {
		System.out.println("id�Ǵ� password�� Ʋ�Ƚ��ϴ�.");
		}
	}

}
