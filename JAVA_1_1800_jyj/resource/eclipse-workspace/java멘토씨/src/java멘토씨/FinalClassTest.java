package java���侾;

public class FinalClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leader leader =new Leader();
		leader.say();
		
	}

}
class Student_1{
	void learn() {
		System.out.println("����");
	}
	void eat() {
		System.out.println("��Ա�");
	}
	void say() {
		System.out.println("������ �ȳ��ϼ���!");
	}
}
class Leader extends Student_3{
	void lead() {
		
	}
	void say() {
		System.out.println("�����Բ� �λ�");
		super.say();
	}
}