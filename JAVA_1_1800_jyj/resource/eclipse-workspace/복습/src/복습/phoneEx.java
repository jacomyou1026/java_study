package ����;
abstract class Phone{
	public String owner;
	public Phone(String owner) {
		this.owner = owner;
	}
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
}
class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);
	}
	public void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
	
}

public class phoneEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone smartphone = new SmartPhone("Ȧ�浿");

		smartphone.turnOff();
				
	}

}
