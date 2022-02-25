package javaExercise;

import com.sun.tools.sjavac.ProblemException;

public class Tire {
	public int maxRotation; // �ִ� ȸ����
	public int accumlatedRotation; // ���� ȸ����
	public String location; // Ÿ�̾� ��ġ

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() {
		++accumlatedRotation;
		if (accumlatedRotation < maxRotation) { // ������ ���(����<�ִ�)
			System.out.println(location + "Tire ����:" + (maxRotation - accumlatedRotation) + "ȸ");
			return true;
		} else { // ��ũ�� ������
			System.out.println("***" + location + "Tire��ũ ***");
			return false;
		}
	}

}

class Car {
	Tire frontLeftTire = new Tire("�տ���", 6);
	Tire frontRightTire = new Tire("�տ�����", 2);
	Tire backLeftTire = new Tire("�ڿ���", 3);
	Tire backRightTire = new Tire("�ڿ�����", 4);

	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		if (frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if (frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if (backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if (backRightTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}

	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}

}

class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	public boolean roll() {
		++accumlatedRotation;
		if (accumlatedRotation < maxRotation) {
			System.out.println(location + "HankookTire����" + (maxRotation - accumlatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("***" + location + "HankookTire ��ũ***");
			return false;
		}

	}
}
class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	public boolean roll() {
		++accumlatedRotation;
		if (accumlatedRotation < maxRotation) {
			System.out.println(location + "kuhoTire����" + (maxRotation - accumlatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("***" + location + "KuhoTire ��ũ***");
			return false;
		}

}}
class carEx{
	public static void main(String[] args) {
		Car car = new Car();
		for(int i=0;i<=5;i++) {
			int problemLocation = car.run();
			}
		
		switch(problemLocation) {
		case 1:
			System.out.println("�տ��� HankookTire�� ��ü");
			car.frontLeftTire = new HankookTire("�տ���", 15);
			break;
		case 2:
			System.out.println("�տ����� KumhoTire�� ��ü");
			car.frontRightTire= new KumhoTire("�տ�����",13);
			break;
		case 3:
			System.out.println("�ڿ��� HankookTire�� ��ü");
			car.backLeftTire= new HankookTire("�ڿ���",14);
			break;
		case 4:
			System.out.println("KumhoTire�� ��ü");
			car.backRightTire= new KumhoTire("�ڿ�����",17);
			break;
			
		}
		System.out.println("--------------------------------------------");
	}
}