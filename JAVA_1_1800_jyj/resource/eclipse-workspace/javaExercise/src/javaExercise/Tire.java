package javaExercise;

import com.sun.tools.sjavac.ProblemException;

public class Tire {
	public int maxRotation; // 최대 회전수
	public int accumlatedRotation; // 누적 회전수
	public String location; // 타이어 위치

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() {
		++accumlatedRotation;
		if (accumlatedRotation < maxRotation) { // 정상일 경우(누적<최대)
			System.out.println(location + "Tire 수명:" + (maxRotation - accumlatedRotation) + "회");
			return true;
		} else { // 펑크가 났을때
			System.out.println("***" + location + "Tire펑크 ***");
			return false;
		}
	}

}

class Car {
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);

	int run() {
		System.out.println("[자동차가 달립니다.]");
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
		System.out.println("[자동차가 멈춥니다.]");
	}

}

class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	public boolean roll() {
		++accumlatedRotation;
		if (accumlatedRotation < maxRotation) {
			System.out.println(location + "HankookTire수명" + (maxRotation - accumlatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "HankookTire 펑크***");
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
			System.out.println(location + "kuhoTire수명" + (maxRotation - accumlatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "KuhoTire 펑크***");
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
			System.out.println("앞왼쪽 HankookTire로 교체");
			car.frontLeftTire = new HankookTire("앞왼쪽", 15);
			break;
		case 2:
			System.out.println("앞오른쪽 KumhoTire로 교체");
			car.frontRightTire= new KumhoTire("앞오른쪽",13);
			break;
		case 3:
			System.out.println("뒤왼쪽 HankookTire로 교체");
			car.backLeftTire= new HankookTire("뒤왼쪽",14);
			break;
		case 4:
			System.out.println("KumhoTire로 교체");
			car.backRightTire= new KumhoTire("뒤오른쪽",17);
			break;
			
		}
		System.out.println("--------------------------------------------");
	}
}