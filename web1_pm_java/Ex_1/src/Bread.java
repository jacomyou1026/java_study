
public class Bread {
	void makeBread() {
		System.out.println("���� ��������ϴ�.");
		System.out.println("-------------------");
	}
	void makeBread(int s) {
		for (int i = 0; i < s; i++) {
			System.out.println("���� ��������ϴ�.");
		}
		System.out.println("��û�Ͻ� "+s+"���� ���� ��������ϴ�.");
		System.out.println("----------------------------");
		
	}
	void makeBread(String n, int s) {
		for (int i = 0; i < s; i++) {
			System.out.println(n+"�� ��������ϴ�.");
		}

		System.out.println("��û�Ͻ� "+n+"���� "+n+"���� ��������ϴ�.");
	}
}
