package java���侾;
class Car{
	boolean powerOn;
	String color;
	int wheel;
	int speed;
	boolean wiperOn;
	
	void power() {
		powerOn =!powerOn;	
	}
	void speedUp() {
		speed++;
	}
	void speedDown() {
		speed--;
	}
	void wiper() {
		wiperOn = !wiperOn;
	}
	
}

public class Class_eExam1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car();
		System.out.println("�õ� ó�� �ʱ�ȭ: "+mycar.powerOn);
		System.out.println("���� ���� �ʱ�ȭ: "+mycar.color);
		System.out.println("������ �� �ʱ�ȭ: "+mycar.wheel);
		System.out.println("�ӷ� �ʱ�ȭ: "+mycar.speed);
		System.out.println("������ �۵� �ʱ�ȭ: "+mycar.wiperOn);
		
		mycar.power();
		System.out.println("�õ� �޼��� ����: "+mycar.powerOn);
		mycar.power();
		System.out.println("�õ� �ٽ� �޼��� ����: "+mycar.powerOn);
		
		mycar.color ="black";
		System.out.println("���� ���� ����: "+mycar.color);
	}

}
