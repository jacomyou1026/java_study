package 복습;
abstract class Phone{
	public String owner;
	public Phone(String owner) {
		this.owner = owner;
	}
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);
	}
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
}

public class phoneEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone smartphone = new SmartPhone("홀길동");

		smartphone.turnOff();
				
	}

}
